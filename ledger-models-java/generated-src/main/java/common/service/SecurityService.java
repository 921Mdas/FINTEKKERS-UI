// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/security-service/security_service.proto

package common.service;

public final class SecurityService {
  private SecurityService() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf service {@code security_service.Security}
   */
  public static abstract class Security
      implements com.google.protobuf.Service {
    protected Security() {}

    public interface Interface {
      /**
       * <code>rpc CreateOrUpdate(.security.CreateSecurityRequestProto) returns (.security.CreateSecurityResponseProto);</code>
       */
      public abstract void createOrUpdate(
          com.google.protobuf.RpcController controller,
          common.request.CreateSecurityRequestProto request,
          com.google.protobuf.RpcCallback<common.request.CreateSecurityResponseProto> done);

      /**
       * <code>rpc GetByIDs(.security.QuerySecurityRequestProto) returns (.security.QuerySecurityResponseProto);</code>
       */
      public abstract void getByIDs(
          com.google.protobuf.RpcController controller,
          common.request.QuerySecurityRequestProto request,
          com.google.protobuf.RpcCallback<common.request.QuerySecurityResponseProto> done);

      /**
       * <code>rpc Search(.security.QuerySecurityRequestProto) returns (.security.QuerySecurityResponseProto);</code>
       */
      public abstract void search(
          com.google.protobuf.RpcController controller,
          common.request.QuerySecurityRequestProto request,
          com.google.protobuf.RpcCallback<common.request.QuerySecurityResponseProto> done);

      /**
       * <code>rpc ListIDs(.security.QuerySecurityRequestProto) returns (.security.QuerySecurityResponseProto);</code>
       */
      public abstract void listIDs(
          com.google.protobuf.RpcController controller,
          common.request.QuerySecurityRequestProto request,
          com.google.protobuf.RpcCallback<common.request.QuerySecurityResponseProto> done);

      /**
       * <code>rpc ValidateCreateOrUpdate(.security.QuerySecurityRequestProto) returns (.util.errors.Summary);</code>
       */
      public abstract void validateCreateOrUpdate(
          com.google.protobuf.RpcController controller,
          common.request.QuerySecurityRequestProto request,
          com.google.protobuf.RpcCallback<util.errors.SummaryOuterClass.Summary> done);

      /**
       * <code>rpc ValidateQueryRequest(.security.QuerySecurityRequestProto) returns (.util.errors.Summary);</code>
       */
      public abstract void validateQueryRequest(
          com.google.protobuf.RpcController controller,
          common.request.QuerySecurityRequestProto request,
          com.google.protobuf.RpcCallback<util.errors.SummaryOuterClass.Summary> done);

    }

    public static com.google.protobuf.Service newReflectiveService(
        final Interface impl) {
      return new Security() {
        @java.lang.Override
        public  void createOrUpdate(
            com.google.protobuf.RpcController controller,
            common.request.CreateSecurityRequestProto request,
            com.google.protobuf.RpcCallback<common.request.CreateSecurityResponseProto> done) {
          impl.createOrUpdate(controller, request, done);
        }

        @java.lang.Override
        public  void getByIDs(
            com.google.protobuf.RpcController controller,
            common.request.QuerySecurityRequestProto request,
            com.google.protobuf.RpcCallback<common.request.QuerySecurityResponseProto> done) {
          impl.getByIDs(controller, request, done);
        }

        @java.lang.Override
        public  void search(
            com.google.protobuf.RpcController controller,
            common.request.QuerySecurityRequestProto request,
            com.google.protobuf.RpcCallback<common.request.QuerySecurityResponseProto> done) {
          impl.search(controller, request, done);
        }

        @java.lang.Override
        public  void listIDs(
            com.google.protobuf.RpcController controller,
            common.request.QuerySecurityRequestProto request,
            com.google.protobuf.RpcCallback<common.request.QuerySecurityResponseProto> done) {
          impl.listIDs(controller, request, done);
        }

        @java.lang.Override
        public  void validateCreateOrUpdate(
            com.google.protobuf.RpcController controller,
            common.request.QuerySecurityRequestProto request,
            com.google.protobuf.RpcCallback<util.errors.SummaryOuterClass.Summary> done) {
          impl.validateCreateOrUpdate(controller, request, done);
        }

        @java.lang.Override
        public  void validateQueryRequest(
            com.google.protobuf.RpcController controller,
            common.request.QuerySecurityRequestProto request,
            com.google.protobuf.RpcCallback<util.errors.SummaryOuterClass.Summary> done) {
          impl.validateQueryRequest(controller, request, done);
        }

      };
    }

    public static com.google.protobuf.BlockingService
        newReflectiveBlockingService(final BlockingInterface impl) {
      return new com.google.protobuf.BlockingService() {
        public final com.google.protobuf.Descriptors.ServiceDescriptor
            getDescriptorForType() {
          return getDescriptor();
        }

        public final com.google.protobuf.Message callBlockingMethod(
            com.google.protobuf.Descriptors.MethodDescriptor method,
            com.google.protobuf.RpcController controller,
            com.google.protobuf.Message request)
            throws com.google.protobuf.ServiceException {
          if (method.getService() != getDescriptor()) {
            throw new java.lang.IllegalArgumentException(
              "Service.callBlockingMethod() given method descriptor for " +
              "wrong service type.");
          }
          switch(method.getIndex()) {
            case 0:
              return impl.createOrUpdate(controller, (common.request.CreateSecurityRequestProto)request);
            case 1:
              return impl.getByIDs(controller, (common.request.QuerySecurityRequestProto)request);
            case 2:
              return impl.search(controller, (common.request.QuerySecurityRequestProto)request);
            case 3:
              return impl.listIDs(controller, (common.request.QuerySecurityRequestProto)request);
            case 4:
              return impl.validateCreateOrUpdate(controller, (common.request.QuerySecurityRequestProto)request);
            case 5:
              return impl.validateQueryRequest(controller, (common.request.QuerySecurityRequestProto)request);
            default:
              throw new java.lang.AssertionError("Can't get here.");
          }
        }

        public final com.google.protobuf.Message
            getRequestPrototype(
            com.google.protobuf.Descriptors.MethodDescriptor method) {
          if (method.getService() != getDescriptor()) {
            throw new java.lang.IllegalArgumentException(
              "Service.getRequestPrototype() given method " +
              "descriptor for wrong service type.");
          }
          switch(method.getIndex()) {
            case 0:
              return common.request.CreateSecurityRequestProto.getDefaultInstance();
            case 1:
              return common.request.QuerySecurityRequestProto.getDefaultInstance();
            case 2:
              return common.request.QuerySecurityRequestProto.getDefaultInstance();
            case 3:
              return common.request.QuerySecurityRequestProto.getDefaultInstance();
            case 4:
              return common.request.QuerySecurityRequestProto.getDefaultInstance();
            case 5:
              return common.request.QuerySecurityRequestProto.getDefaultInstance();
            default:
              throw new java.lang.AssertionError("Can't get here.");
          }
        }

        public final com.google.protobuf.Message
            getResponsePrototype(
            com.google.protobuf.Descriptors.MethodDescriptor method) {
          if (method.getService() != getDescriptor()) {
            throw new java.lang.IllegalArgumentException(
              "Service.getResponsePrototype() given method " +
              "descriptor for wrong service type.");
          }
          switch(method.getIndex()) {
            case 0:
              return common.request.CreateSecurityResponseProto.getDefaultInstance();
            case 1:
              return common.request.QuerySecurityResponseProto.getDefaultInstance();
            case 2:
              return common.request.QuerySecurityResponseProto.getDefaultInstance();
            case 3:
              return common.request.QuerySecurityResponseProto.getDefaultInstance();
            case 4:
              return util.errors.SummaryOuterClass.Summary.getDefaultInstance();
            case 5:
              return util.errors.SummaryOuterClass.Summary.getDefaultInstance();
            default:
              throw new java.lang.AssertionError("Can't get here.");
          }
        }

      };
    }

    /**
     * <code>rpc CreateOrUpdate(.security.CreateSecurityRequestProto) returns (.security.CreateSecurityResponseProto);</code>
     */
    public abstract void createOrUpdate(
        com.google.protobuf.RpcController controller,
        common.request.CreateSecurityRequestProto request,
        com.google.protobuf.RpcCallback<common.request.CreateSecurityResponseProto> done);

    /**
     * <code>rpc GetByIDs(.security.QuerySecurityRequestProto) returns (.security.QuerySecurityResponseProto);</code>
     */
    public abstract void getByIDs(
        com.google.protobuf.RpcController controller,
        common.request.QuerySecurityRequestProto request,
        com.google.protobuf.RpcCallback<common.request.QuerySecurityResponseProto> done);

    /**
     * <code>rpc Search(.security.QuerySecurityRequestProto) returns (.security.QuerySecurityResponseProto);</code>
     */
    public abstract void search(
        com.google.protobuf.RpcController controller,
        common.request.QuerySecurityRequestProto request,
        com.google.protobuf.RpcCallback<common.request.QuerySecurityResponseProto> done);

    /**
     * <code>rpc ListIDs(.security.QuerySecurityRequestProto) returns (.security.QuerySecurityResponseProto);</code>
     */
    public abstract void listIDs(
        com.google.protobuf.RpcController controller,
        common.request.QuerySecurityRequestProto request,
        com.google.protobuf.RpcCallback<common.request.QuerySecurityResponseProto> done);

    /**
     * <code>rpc ValidateCreateOrUpdate(.security.QuerySecurityRequestProto) returns (.util.errors.Summary);</code>
     */
    public abstract void validateCreateOrUpdate(
        com.google.protobuf.RpcController controller,
        common.request.QuerySecurityRequestProto request,
        com.google.protobuf.RpcCallback<util.errors.SummaryOuterClass.Summary> done);

    /**
     * <code>rpc ValidateQueryRequest(.security.QuerySecurityRequestProto) returns (.util.errors.Summary);</code>
     */
    public abstract void validateQueryRequest(
        com.google.protobuf.RpcController controller,
        common.request.QuerySecurityRequestProto request,
        com.google.protobuf.RpcCallback<util.errors.SummaryOuterClass.Summary> done);

    public static final
        com.google.protobuf.Descriptors.ServiceDescriptor
        getDescriptor() {
      return common.service.SecurityService.getDescriptor().getServices().get(0);
    }
    public final com.google.protobuf.Descriptors.ServiceDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }

    public final void callMethod(
        com.google.protobuf.Descriptors.MethodDescriptor method,
        com.google.protobuf.RpcController controller,
        com.google.protobuf.Message request,
        com.google.protobuf.RpcCallback<
          com.google.protobuf.Message> done) {
      if (method.getService() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "Service.callMethod() given method descriptor for wrong " +
          "service type.");
      }
      switch(method.getIndex()) {
        case 0:
          this.createOrUpdate(controller, (common.request.CreateSecurityRequestProto)request,
            com.google.protobuf.RpcUtil.<common.request.CreateSecurityResponseProto>specializeCallback(
              done));
          return;
        case 1:
          this.getByIDs(controller, (common.request.QuerySecurityRequestProto)request,
            com.google.protobuf.RpcUtil.<common.request.QuerySecurityResponseProto>specializeCallback(
              done));
          return;
        case 2:
          this.search(controller, (common.request.QuerySecurityRequestProto)request,
            com.google.protobuf.RpcUtil.<common.request.QuerySecurityResponseProto>specializeCallback(
              done));
          return;
        case 3:
          this.listIDs(controller, (common.request.QuerySecurityRequestProto)request,
            com.google.protobuf.RpcUtil.<common.request.QuerySecurityResponseProto>specializeCallback(
              done));
          return;
        case 4:
          this.validateCreateOrUpdate(controller, (common.request.QuerySecurityRequestProto)request,
            com.google.protobuf.RpcUtil.<util.errors.SummaryOuterClass.Summary>specializeCallback(
              done));
          return;
        case 5:
          this.validateQueryRequest(controller, (common.request.QuerySecurityRequestProto)request,
            com.google.protobuf.RpcUtil.<util.errors.SummaryOuterClass.Summary>specializeCallback(
              done));
          return;
        default:
          throw new java.lang.AssertionError("Can't get here.");
      }
    }

    public final com.google.protobuf.Message
        getRequestPrototype(
        com.google.protobuf.Descriptors.MethodDescriptor method) {
      if (method.getService() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "Service.getRequestPrototype() given method " +
          "descriptor for wrong service type.");
      }
      switch(method.getIndex()) {
        case 0:
          return common.request.CreateSecurityRequestProto.getDefaultInstance();
        case 1:
          return common.request.QuerySecurityRequestProto.getDefaultInstance();
        case 2:
          return common.request.QuerySecurityRequestProto.getDefaultInstance();
        case 3:
          return common.request.QuerySecurityRequestProto.getDefaultInstance();
        case 4:
          return common.request.QuerySecurityRequestProto.getDefaultInstance();
        case 5:
          return common.request.QuerySecurityRequestProto.getDefaultInstance();
        default:
          throw new java.lang.AssertionError("Can't get here.");
      }
    }

    public final com.google.protobuf.Message
        getResponsePrototype(
        com.google.protobuf.Descriptors.MethodDescriptor method) {
      if (method.getService() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "Service.getResponsePrototype() given method " +
          "descriptor for wrong service type.");
      }
      switch(method.getIndex()) {
        case 0:
          return common.request.CreateSecurityResponseProto.getDefaultInstance();
        case 1:
          return common.request.QuerySecurityResponseProto.getDefaultInstance();
        case 2:
          return common.request.QuerySecurityResponseProto.getDefaultInstance();
        case 3:
          return common.request.QuerySecurityResponseProto.getDefaultInstance();
        case 4:
          return util.errors.SummaryOuterClass.Summary.getDefaultInstance();
        case 5:
          return util.errors.SummaryOuterClass.Summary.getDefaultInstance();
        default:
          throw new java.lang.AssertionError("Can't get here.");
      }
    }

    public static Stub newStub(
        com.google.protobuf.RpcChannel channel) {
      return new Stub(channel);
    }

    public static final class Stub extends common.service.SecurityService.Security implements Interface {
      private Stub(com.google.protobuf.RpcChannel channel) {
        this.channel = channel;
      }

      private final com.google.protobuf.RpcChannel channel;

      public com.google.protobuf.RpcChannel getChannel() {
        return channel;
      }

      public  void createOrUpdate(
          com.google.protobuf.RpcController controller,
          common.request.CreateSecurityRequestProto request,
          com.google.protobuf.RpcCallback<common.request.CreateSecurityResponseProto> done) {
        channel.callMethod(
          getDescriptor().getMethods().get(0),
          controller,
          request,
          common.request.CreateSecurityResponseProto.getDefaultInstance(),
          com.google.protobuf.RpcUtil.generalizeCallback(
            done,
            common.request.CreateSecurityResponseProto.class,
            common.request.CreateSecurityResponseProto.getDefaultInstance()));
      }

      public  void getByIDs(
          com.google.protobuf.RpcController controller,
          common.request.QuerySecurityRequestProto request,
          com.google.protobuf.RpcCallback<common.request.QuerySecurityResponseProto> done) {
        channel.callMethod(
          getDescriptor().getMethods().get(1),
          controller,
          request,
          common.request.QuerySecurityResponseProto.getDefaultInstance(),
          com.google.protobuf.RpcUtil.generalizeCallback(
            done,
            common.request.QuerySecurityResponseProto.class,
            common.request.QuerySecurityResponseProto.getDefaultInstance()));
      }

      public  void search(
          com.google.protobuf.RpcController controller,
          common.request.QuerySecurityRequestProto request,
          com.google.protobuf.RpcCallback<common.request.QuerySecurityResponseProto> done) {
        channel.callMethod(
          getDescriptor().getMethods().get(2),
          controller,
          request,
          common.request.QuerySecurityResponseProto.getDefaultInstance(),
          com.google.protobuf.RpcUtil.generalizeCallback(
            done,
            common.request.QuerySecurityResponseProto.class,
            common.request.QuerySecurityResponseProto.getDefaultInstance()));
      }

      public  void listIDs(
          com.google.protobuf.RpcController controller,
          common.request.QuerySecurityRequestProto request,
          com.google.protobuf.RpcCallback<common.request.QuerySecurityResponseProto> done) {
        channel.callMethod(
          getDescriptor().getMethods().get(3),
          controller,
          request,
          common.request.QuerySecurityResponseProto.getDefaultInstance(),
          com.google.protobuf.RpcUtil.generalizeCallback(
            done,
            common.request.QuerySecurityResponseProto.class,
            common.request.QuerySecurityResponseProto.getDefaultInstance()));
      }

      public  void validateCreateOrUpdate(
          com.google.protobuf.RpcController controller,
          common.request.QuerySecurityRequestProto request,
          com.google.protobuf.RpcCallback<util.errors.SummaryOuterClass.Summary> done) {
        channel.callMethod(
          getDescriptor().getMethods().get(4),
          controller,
          request,
          util.errors.SummaryOuterClass.Summary.getDefaultInstance(),
          com.google.protobuf.RpcUtil.generalizeCallback(
            done,
            util.errors.SummaryOuterClass.Summary.class,
            util.errors.SummaryOuterClass.Summary.getDefaultInstance()));
      }

      public  void validateQueryRequest(
          com.google.protobuf.RpcController controller,
          common.request.QuerySecurityRequestProto request,
          com.google.protobuf.RpcCallback<util.errors.SummaryOuterClass.Summary> done) {
        channel.callMethod(
          getDescriptor().getMethods().get(5),
          controller,
          request,
          util.errors.SummaryOuterClass.Summary.getDefaultInstance(),
          com.google.protobuf.RpcUtil.generalizeCallback(
            done,
            util.errors.SummaryOuterClass.Summary.class,
            util.errors.SummaryOuterClass.Summary.getDefaultInstance()));
      }
    }

    public static BlockingInterface newBlockingStub(
        com.google.protobuf.BlockingRpcChannel channel) {
      return new BlockingStub(channel);
    }

    public interface BlockingInterface {
      public common.request.CreateSecurityResponseProto createOrUpdate(
          com.google.protobuf.RpcController controller,
          common.request.CreateSecurityRequestProto request)
          throws com.google.protobuf.ServiceException;

      public common.request.QuerySecurityResponseProto getByIDs(
          com.google.protobuf.RpcController controller,
          common.request.QuerySecurityRequestProto request)
          throws com.google.protobuf.ServiceException;

      public common.request.QuerySecurityResponseProto search(
          com.google.protobuf.RpcController controller,
          common.request.QuerySecurityRequestProto request)
          throws com.google.protobuf.ServiceException;

      public common.request.QuerySecurityResponseProto listIDs(
          com.google.protobuf.RpcController controller,
          common.request.QuerySecurityRequestProto request)
          throws com.google.protobuf.ServiceException;

      public util.errors.SummaryOuterClass.Summary validateCreateOrUpdate(
          com.google.protobuf.RpcController controller,
          common.request.QuerySecurityRequestProto request)
          throws com.google.protobuf.ServiceException;

      public util.errors.SummaryOuterClass.Summary validateQueryRequest(
          com.google.protobuf.RpcController controller,
          common.request.QuerySecurityRequestProto request)
          throws com.google.protobuf.ServiceException;
    }

    private static final class BlockingStub implements BlockingInterface {
      private BlockingStub(com.google.protobuf.BlockingRpcChannel channel) {
        this.channel = channel;
      }

      private final com.google.protobuf.BlockingRpcChannel channel;

      public common.request.CreateSecurityResponseProto createOrUpdate(
          com.google.protobuf.RpcController controller,
          common.request.CreateSecurityRequestProto request)
          throws com.google.protobuf.ServiceException {
        return (common.request.CreateSecurityResponseProto) channel.callBlockingMethod(
          getDescriptor().getMethods().get(0),
          controller,
          request,
          common.request.CreateSecurityResponseProto.getDefaultInstance());
      }


      public common.request.QuerySecurityResponseProto getByIDs(
          com.google.protobuf.RpcController controller,
          common.request.QuerySecurityRequestProto request)
          throws com.google.protobuf.ServiceException {
        return (common.request.QuerySecurityResponseProto) channel.callBlockingMethod(
          getDescriptor().getMethods().get(1),
          controller,
          request,
          common.request.QuerySecurityResponseProto.getDefaultInstance());
      }


      public common.request.QuerySecurityResponseProto search(
          com.google.protobuf.RpcController controller,
          common.request.QuerySecurityRequestProto request)
          throws com.google.protobuf.ServiceException {
        return (common.request.QuerySecurityResponseProto) channel.callBlockingMethod(
          getDescriptor().getMethods().get(2),
          controller,
          request,
          common.request.QuerySecurityResponseProto.getDefaultInstance());
      }


      public common.request.QuerySecurityResponseProto listIDs(
          com.google.protobuf.RpcController controller,
          common.request.QuerySecurityRequestProto request)
          throws com.google.protobuf.ServiceException {
        return (common.request.QuerySecurityResponseProto) channel.callBlockingMethod(
          getDescriptor().getMethods().get(3),
          controller,
          request,
          common.request.QuerySecurityResponseProto.getDefaultInstance());
      }


      public util.errors.SummaryOuterClass.Summary validateCreateOrUpdate(
          com.google.protobuf.RpcController controller,
          common.request.QuerySecurityRequestProto request)
          throws com.google.protobuf.ServiceException {
        return (util.errors.SummaryOuterClass.Summary) channel.callBlockingMethod(
          getDescriptor().getMethods().get(4),
          controller,
          request,
          util.errors.SummaryOuterClass.Summary.getDefaultInstance());
      }


      public util.errors.SummaryOuterClass.Summary validateQueryRequest(
          com.google.protobuf.RpcController controller,
          common.request.QuerySecurityRequestProto request)
          throws com.google.protobuf.ServiceException {
        return (util.errors.SummaryOuterClass.Summary) channel.callBlockingMethod(
          getDescriptor().getMethods().get(5),
          controller,
          request,
          util.errors.SummaryOuterClass.Summary.getDefaultInstance());
      }

    }

    // @@protoc_insertion_point(class_scope:security_service.Security)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n0services/security-service/security_ser" +
      "vice.proto\022\020security_service\032.requests/s" +
      "ecurity/query_security_request.proto\032/re" +
      "quests/security/query_security_response." +
      "proto\032/requests/security/create_security" +
      "_request.proto\0320requests/security/create" +
      "_security_response.proto\032\"requests/util/" +
      "errors/summary.proto2\223\004\n\010Security\022]\n\016Cre" +
      "ateOrUpdate\022$.security.CreateSecurityReq" +
      "uestProto\032%.security.CreateSecurityRespo" +
      "nseProto\022U\n\010GetByIDs\022#.security.QuerySec" +
      "urityRequestProto\032$.security.QuerySecuri" +
      "tyResponseProto\022S\n\006Search\022#.security.Que" +
      "rySecurityRequestProto\032$.security.QueryS" +
      "ecurityResponseProto\022T\n\007ListIDs\022#.securi" +
      "ty.QuerySecurityRequestProto\032$.security." +
      "QuerySecurityResponseProto\022S\n\026ValidateCr" +
      "eateOrUpdate\022#.security.QuerySecurityReq" +
      "uestProto\032\024.util.errors.Summary\022Q\n\024Valid" +
      "ateQueryRequest\022#.security.QuerySecurity" +
      "RequestProto\032\024.util.errors.SummaryB\023\n\016co" +
      "mmon.service\210\001\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          common.request.QuerySecurityRequestProtos.getDescriptor(),
          common.request.QuerySecurityResponseProtos.getDescriptor(),
          common.request.CreateSecurityRequestProtos.getDescriptor(),
          common.request.CreateSecurityResponseProtos.getDescriptor(),
          util.errors.SummaryOuterClass.getDescriptor(),
        });
    common.request.QuerySecurityRequestProtos.getDescriptor();
    common.request.QuerySecurityResponseProtos.getDescriptor();
    common.request.CreateSecurityRequestProtos.getDescriptor();
    common.request.CreateSecurityResponseProtos.getDescriptor();
    util.errors.SummaryOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
