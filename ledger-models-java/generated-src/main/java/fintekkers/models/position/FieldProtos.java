// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: fintekkers/models/position/field.proto

package fintekkers.models.position;

public final class FieldProtos {
  private FieldProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&fintekkers/models/position/field.proto" +
      "\022\032fintekkers.models.position*\363\003\n\nFieldPr" +
      "oto\022\021\n\rUNKNOWN_FIELD\020\000\022\006\n\002ID\020\001\022\022\n\016EFFECT" +
      "IVE_DATE\020\n\022\014\n\010STRATEGY\020\013\022\014\n\010SECURITY\020\014\022\030" +
      "\n\024SECURITY_DESCRIPTION\020=\022\030\n\024CASH_IMPACT_" +
      "SECURITY\020\r\022\017\n\013ASSET_CLASS\0202\022\021\n\rPRODUCT_C" +
      "LASS\0203\022\020\n\014PRODUCT_TYPE\0204\022\017\n\013SECURITY_ID\020" +
      "5\022\016\n\nIDENTIFIER\0206\022\t\n\005TENOR\0207\022\021\n\rMATURITY" +
      "_DATE\0208\022\022\n\016ADJUSTED_TENOR\0209\022\r\n\tPORTFOLIO" +
      "\020\016\022\020\n\014PORTFOLIO_ID\020\017\022\022\n\016PORTFOLIO_NAME\020<" +
      "\022\t\n\005PRICE\020\020\022\014\n\010PRICE_ID\020\021\022\020\n\014IS_CANCELLE" +
      "D\020\022\022\023\n\017POSITION_STATUS\020\023\022\016\n\nTRADE_DATE\020\036" +
      "\022\023\n\017SETTLEMENT_DATE\020\037\022\024\n\020TRANSACTION_TYP" +
      "E\020 \022\025\n\021TAX_LOT_OPEN_DATE\020(\022\026\n\022TAX_LOT_CL" +
      "OSE_DATE\020)B\017B\013FieldProtosP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}