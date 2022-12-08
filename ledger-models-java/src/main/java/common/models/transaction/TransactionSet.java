package common.models.transaction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public class TransactionSet extends HashMap<UUID, List<Transaction>> {
    public void addTransaction(Transaction transaction){
        if(!containsKey(transaction.getID())) {
            put(transaction.getID(), new ArrayList<>());
        }

        get(transaction.getID()).add(transaction);
    }

    public List<Transaction> allLatestTransactions() {
        List<Transaction> transactions = new ArrayList<>();

        if(true)
            throw new RuntimeException("Not impleented");

        return transactions;
    }
    
    public List<Transaction> allTransactionsAllVersions() {
        List<Transaction> transactions = new ArrayList<>();

        for(UUID key : keySet()) {
            List<Transaction> tmpTxns = get(key);
            for(Transaction tmpTxn : tmpTxns) {
                transactions.add(tmpTxn);
            }
        }
        return transactions;
    }
}