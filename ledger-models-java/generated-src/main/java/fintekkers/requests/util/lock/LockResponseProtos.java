// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: fintekkers/requests/util/lock/lock_response.proto

package fintekkers.requests.util.lock;

public final class LockResponseProtos {
  private LockResponseProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_fintekkers_requests_util_lock_LockResponseProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_fintekkers_requests_util_lock_LockResponseProto_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n1fintekkers/requests/util/lock/lock_res" +
      "ponse.proto\022\035fintekkers.requests.util.lo" +
      "ck\032,fintekkers/models/util/lock/node_sta" +
      "te.proto\0320fintekkers/requests/util/lock/" +
      "lock_request.proto\032-fintekkers/requests/" +
      "util/errors/summary.proto\"\217\002\n\021LockRespon" +
      "seProto\022\024\n\014object_class\030\001 \001(\t\022\017\n\007version" +
      "\030\002 \001(\t\022I\n\020get_lock_request\030\003 \001(\0132/.finte" +
      "kkers.requests.util.lock.LockRequestProt" +
      "o\022=\n\rlock_response\030\004 \001(\0132&.fintekkers.mo" +
      "dels.util.lock.NodeState\022I\n\022errors_or_wa" +
      "rnings\030( \001(\0132-.fintekkers.requests.util." +
      "errors.SummaryProtoB\026B\022LockResponseProto" +
      "sP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          fintekkers.models.util.lock.NodeStateOuterClass.getDescriptor(),
          fintekkers.requests.util.lock.LockRequestProtos.getDescriptor(),
          fintekkers.requests.util.errors.Summary.getDescriptor(),
        });
    internal_static_fintekkers_requests_util_lock_LockResponseProto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_fintekkers_requests_util_lock_LockResponseProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_fintekkers_requests_util_lock_LockResponseProto_descriptor,
        new java.lang.String[] { "ObjectClass", "Version", "GetLockRequest", "LockResponse", "ErrorsOrWarnings", });
    fintekkers.models.util.lock.NodeStateOuterClass.getDescriptor();
    fintekkers.requests.util.lock.LockRequestProtos.getDescriptor();
    fintekkers.requests.util.errors.Summary.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
