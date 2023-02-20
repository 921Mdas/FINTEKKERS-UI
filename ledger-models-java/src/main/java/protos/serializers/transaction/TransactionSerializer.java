package protos.serializers.transaction;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import common.models.JSONFieldNames;
import common.models.transaction.Transaction;
import common.models.transaction.TransactionType;
import fintekkers.models.position.PositionStatusProto;
import fintekkers.models.price.PriceProto;
import fintekkers.models.security.SecurityProto;
import fintekkers.models.transaction.TransactionProto;
import fintekkers.models.transaction.TransactionTypeProto;
import protos.serializers.IRawDataModelObjectSerializer;
import protos.serializers.portfolio.PortfolioSerializer;
import protos.serializers.price.PriceSerializer;
import protos.serializers.security.SecuritySerializer;
import protos.serializers.strategy.StrategySerializer;
import protos.serializers.util.json.JsonSerializationUtil;
import protos.serializers.util.proto.ProtoSerializationUtil;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class TransactionSerializer implements IRawDataModelObjectSerializer<TransactionProto, Transaction> {
    private static final class InstanceHolder {
        private static final TransactionSerializer INSTANCE = new TransactionSerializer();
    }

    public static TransactionSerializer getInstance() {
        return TransactionSerializer.InstanceHolder.INSTANCE;
    }

    private TransactionSerializer() {
    }

    @Override
    public TransactionProto serialize(Transaction transaction) {
        TransactionProto.Builder builder = TransactionProto.newBuilder()
                //binary metadata
                .setObjectClass(Transaction.class.getSimpleName())
                .setVersion("0.0.1")
                //primary key
                .setUuid(ProtoSerializationUtil.serializeUUID(transaction.getID()))
                .setAsOf(ProtoSerializationUtil.serializeTimestamp(transaction.getAsOf()))
                //transaction details
                .setPortfolio(PortfolioSerializer.getInstance().serialize(transaction.getPortfolio()))
                .setSecurity(SecuritySerializer.getInstance().serialize(transaction.getSecurity()))
                .setTransactionType(TransactionTypeProto.valueOf(transaction.getTransactionType().name()))
                .setQuantity(ProtoSerializationUtil.serializeBigDecimal(transaction.getQuantity()))
                .setPrice(PriceSerializer.getInstance().serialize(transaction.getPrice()))
                .setTradeDate(ProtoSerializationUtil.serializeLocalDate(transaction.getTradeDate()))
                .setSettlementDate(ProtoSerializationUtil.serializeLocalDate(transaction.getSettlementDate()));

        for(Transaction childTransaction: transaction.getChildTransactions())
            builder.addChildTransactions(this.serialize(childTransaction));

        //Biz metadata
        builder.setPositionStatus(PositionStatusProto.valueOf(transaction.getPositionStatus().name()));

        if(transaction.getStrategyAllocation() != null)
                builder.setStrategyAllocation(StrategySerializer.getInstance().serialize(transaction.getStrategyAllocation()));

        if(transaction.getTradeName() != null)
            builder.setTradeName(transaction.getTradeName());

        //System fields
        builder.setIsCancelled(transaction.isCancelled());

        return builder.build();
    }

    @Override
    public Transaction deserialize(TransactionProto proto) {
        Transaction transaction = new Transaction(
                ProtoSerializationUtil.deserializeUUID(proto.getUuid()),
                PortfolioSerializer.getInstance().deserialize(proto.getPortfolio()),
                PriceSerializer.getInstance().deserialize(proto.getPrice()),
                ProtoSerializationUtil.deserializeLocalDate(proto.getTradeDate()),
                ProtoSerializationUtil.deserializeLocalDate(proto.getSettlementDate()),
                ProtoSerializationUtil.deserializeBigDecimal(proto.getQuantity()),
                SecuritySerializer.getInstance().deserialize(proto.getSecurity()),
                TransactionType.valueOf(proto.getTransactionType().name()),
                StrategySerializer.getInstance().deserialize(proto.getStrategyAllocation()),
                ProtoSerializationUtil.deserializeTimestamp(proto.getAsOf()),
                null,
                proto.getTradeName(),
                proto.getPositionStatus());

        for(TransactionProto childTransactionProto : proto.getChildTransactionsList()) {
            Transaction childTransaction = this.deserialize(childTransactionProto);
            childTransaction.setParentTransaction(transaction);
            transaction.getChildTransactions().add(childTransaction);
        }
        //NOTE: Here we are choosing to deserialize what was written down, rather than recreate it. If there
        //is a change in business logic this could create differences in cash impacts that were previously
        //written down, vs. later generated. This logic should be incredible stable, but we could also opt
        //to not serialize cash transactions.
        return transaction;
    }

    @Override
    public String serializeToJson(TransactionProto proto) {
        Gson gson = JsonSerializationUtil.getGsonBuilder();

        List<TransactionProto> childTransactions = new ArrayList<>();
        for(TransactionProto childTransactionProto : proto.getChildTransactionsList()) {
            childTransactionProto =
                    TransactionProto.newBuilder(childTransactionProto)
                            .clearSecurity()
                            .clearPrice()
                            .build();

            childTransactions.add(childTransactionProto);
        }

        TransactionProto.Builder builder = TransactionProto.newBuilder(proto);
        for(int i=0; i<builder.getChildTransactionsCount(); i++) {
            builder.removeChildTransactions(0);
        }

        for (TransactionProto childTransaction : childTransactions) {
            builder.addChildTransactions(childTransaction);
        }

        builder.clearSecurity()
                .clearPrice();

        TransactionProto transactionProto = builder.build();

        String json = gson.toJson(transactionProto);
        JsonObject jsonObject = gson.fromJson(json, JsonObject.class);

        int positionStatusInt = jsonObject.get(JSONFieldNames.POSITION_STATUS).getAsInt();
        PositionStatusProto positionStatusProto = PositionStatusProto.forNumber(positionStatusInt);
        jsonObject.add(JSONFieldNames.POSITION_STATUS, new JsonPrimitive(positionStatusProto.name()));

        int transactionTypeInt = jsonObject.get(JSONFieldNames.TRANSACTION_TYPE).getAsInt();
        TransactionTypeProto transactionTypeProto = TransactionTypeProto.forNumber(transactionTypeInt);
        jsonObject.add(JSONFieldNames.TRANSACTION_TYPE, new JsonPrimitive(transactionTypeProto.name()));

        String securityJson = SecuritySerializer.getInstance().serializeToJson(proto.getSecurity());
        jsonObject.add(JSONFieldNames.SECURITY, gson.fromJson(securityJson, JsonObject.class));

        String priceJson = PriceSerializer.getInstance().serializeToJson(proto.getPrice());
        jsonObject.add(JSONFieldNames.PRICE, gson.fromJson(priceJson, JsonObject.class));

        return gson.toJson(jsonObject);
    }

    @Override
    public TransactionProto deserializeFromJson(String json) {
        Gson gson = JsonSerializationUtil.getGsonBuilder();

        JsonObject jsonObject = gson.fromJson(json, JsonObject.class);

        String positionStatusString = jsonObject.get(JSONFieldNames.POSITION_STATUS).getAsString();
        PositionStatusProto positionStatusProto = PositionStatusProto.valueOf(positionStatusString);
        jsonObject.add(JSONFieldNames.POSITION_STATUS, new JsonPrimitive(positionStatusProto.getNumber()));

        String transactionTypeString = jsonObject.get(JSONFieldNames.TRANSACTION_TYPE).getAsString();
        TransactionTypeProto transactionTypeProto = TransactionTypeProto.valueOf(transactionTypeString);
        jsonObject.add(JSONFieldNames.TRANSACTION_TYPE, new JsonPrimitive(transactionTypeProto.getNumber()));

        String securityJson = jsonObject.get(JSONFieldNames.SECURITY).toString();
        SecurityProto securityProto = SecuritySerializer.getInstance().deserializeFromJson(securityJson);
        jsonObject.remove(JSONFieldNames.SECURITY);

        String priceJson = jsonObject.get(JSONFieldNames.PRICE).toString();
        PriceProto priceProto = PriceSerializer.getInstance().deserializeFromJson(priceJson);

        if(!priceProto.hasSecurity()) {
            //If there is no security then we are inferring that we were just given a raw price and have to
            //set the other fields
            priceProto = PriceProto.newBuilder(priceProto)
                    .setSecurity(securityProto)
                    .setUuid(ProtoSerializationUtil.serializeUUID(UUID.randomUUID()))
                    .setAsOf(ProtoSerializationUtil.serializeTimestamp(ZonedDateTime.now()))
                    .build();
        }

        jsonObject.remove(JSONFieldNames.PRICE);

        TransactionProto transactionProto = gson.fromJson(jsonObject.toString(), TransactionProto.class);
        return TransactionProto.newBuilder(transactionProto)
                .setSecurity(securityProto).setPrice(priceProto).build();
    }

}
