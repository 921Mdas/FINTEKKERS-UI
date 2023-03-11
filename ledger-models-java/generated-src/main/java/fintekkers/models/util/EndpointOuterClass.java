// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: fintekkers/models/util/endpoint.proto

package fintekkers.models.util;

public final class EndpointOuterClass {
  private EndpointOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EndpointOrBuilder extends
      // @@protoc_insertion_point(interface_extends:fintekkers.models.util.Endpoint)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     *The IP address that an endpoint is exposed through. The assumption is the IP 
     *is exposed to internal clients through VPC/Security rules, or to the public 
     *internet if public-facing
     * </pre>
     *
     * <code>string ip = 1;</code>
     * @return The ip.
     */
    java.lang.String getIp();
    /**
     * <pre>
     *The IP address that an endpoint is exposed through. The assumption is the IP 
     *is exposed to internal clients through VPC/Security rules, or to the public 
     *internet if public-facing
     * </pre>
     *
     * <code>string ip = 1;</code>
     * @return The bytes for ip.
     */
    com.google.protobuf.ByteString
        getIpBytes();

    /**
     * <pre>
     *The port that the service is listening to on the specified IP address.
     * </pre>
     *
     * <code>uint32 port = 2;</code>
     * @return The port.
     */
    int getPort();

    /**
     * <pre>
     *Placeholder for the future. For public-facing traffic a URL will be used, and
     *the resolution to IP occurs via DNS.
     * </pre>
     *
     * <code>string fully_qualified_url = 3;</code>
     * @return The fullyQualifiedUrl.
     */
    java.lang.String getFullyQualifiedUrl();
    /**
     * <pre>
     *Placeholder for the future. For public-facing traffic a URL will be used, and
     *the resolution to IP occurs via DNS.
     * </pre>
     *
     * <code>string fully_qualified_url = 3;</code>
     * @return The bytes for fullyQualifiedUrl.
     */
    com.google.protobuf.ByteString
        getFullyQualifiedUrlBytes();
  }
  /**
   * Protobuf type {@code fintekkers.models.util.Endpoint}
   */
  public static final class Endpoint extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:fintekkers.models.util.Endpoint)
      EndpointOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Endpoint.newBuilder() to construct.
    private Endpoint(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Endpoint() {
      ip_ = "";
      fullyQualifiedUrl_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Endpoint();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Endpoint(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              ip_ = s;
              break;
            }
            case 16: {

              port_ = input.readUInt32();
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              fullyQualifiedUrl_ = s;
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return fintekkers.models.util.EndpointOuterClass.internal_static_fintekkers_models_util_Endpoint_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return fintekkers.models.util.EndpointOuterClass.internal_static_fintekkers_models_util_Endpoint_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              fintekkers.models.util.EndpointOuterClass.Endpoint.class, fintekkers.models.util.EndpointOuterClass.Endpoint.Builder.class);
    }

    public static final int IP_FIELD_NUMBER = 1;
    private volatile java.lang.Object ip_;
    /**
     * <pre>
     *The IP address that an endpoint is exposed through. The assumption is the IP 
     *is exposed to internal clients through VPC/Security rules, or to the public 
     *internet if public-facing
     * </pre>
     *
     * <code>string ip = 1;</code>
     * @return The ip.
     */
    @java.lang.Override
    public java.lang.String getIp() {
      java.lang.Object ref = ip_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ip_ = s;
        return s;
      }
    }
    /**
     * <pre>
     *The IP address that an endpoint is exposed through. The assumption is the IP 
     *is exposed to internal clients through VPC/Security rules, or to the public 
     *internet if public-facing
     * </pre>
     *
     * <code>string ip = 1;</code>
     * @return The bytes for ip.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getIpBytes() {
      java.lang.Object ref = ip_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ip_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int PORT_FIELD_NUMBER = 2;
    private int port_;
    /**
     * <pre>
     *The port that the service is listening to on the specified IP address.
     * </pre>
     *
     * <code>uint32 port = 2;</code>
     * @return The port.
     */
    @java.lang.Override
    public int getPort() {
      return port_;
    }

    public static final int FULLY_QUALIFIED_URL_FIELD_NUMBER = 3;
    private volatile java.lang.Object fullyQualifiedUrl_;
    /**
     * <pre>
     *Placeholder for the future. For public-facing traffic a URL will be used, and
     *the resolution to IP occurs via DNS.
     * </pre>
     *
     * <code>string fully_qualified_url = 3;</code>
     * @return The fullyQualifiedUrl.
     */
    @java.lang.Override
    public java.lang.String getFullyQualifiedUrl() {
      java.lang.Object ref = fullyQualifiedUrl_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fullyQualifiedUrl_ = s;
        return s;
      }
    }
    /**
     * <pre>
     *Placeholder for the future. For public-facing traffic a URL will be used, and
     *the resolution to IP occurs via DNS.
     * </pre>
     *
     * <code>string fully_qualified_url = 3;</code>
     * @return The bytes for fullyQualifiedUrl.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getFullyQualifiedUrlBytes() {
      java.lang.Object ref = fullyQualifiedUrl_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fullyQualifiedUrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getIpBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, ip_);
      }
      if (port_ != 0) {
        output.writeUInt32(2, port_);
      }
      if (!getFullyQualifiedUrlBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, fullyQualifiedUrl_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getIpBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, ip_);
      }
      if (port_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, port_);
      }
      if (!getFullyQualifiedUrlBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, fullyQualifiedUrl_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof fintekkers.models.util.EndpointOuterClass.Endpoint)) {
        return super.equals(obj);
      }
      fintekkers.models.util.EndpointOuterClass.Endpoint other = (fintekkers.models.util.EndpointOuterClass.Endpoint) obj;

      if (!getIp()
          .equals(other.getIp())) return false;
      if (getPort()
          != other.getPort()) return false;
      if (!getFullyQualifiedUrl()
          .equals(other.getFullyQualifiedUrl())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + IP_FIELD_NUMBER;
      hash = (53 * hash) + getIp().hashCode();
      hash = (37 * hash) + PORT_FIELD_NUMBER;
      hash = (53 * hash) + getPort();
      hash = (37 * hash) + FULLY_QUALIFIED_URL_FIELD_NUMBER;
      hash = (53 * hash) + getFullyQualifiedUrl().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static fintekkers.models.util.EndpointOuterClass.Endpoint parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static fintekkers.models.util.EndpointOuterClass.Endpoint parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static fintekkers.models.util.EndpointOuterClass.Endpoint parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static fintekkers.models.util.EndpointOuterClass.Endpoint parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static fintekkers.models.util.EndpointOuterClass.Endpoint parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static fintekkers.models.util.EndpointOuterClass.Endpoint parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static fintekkers.models.util.EndpointOuterClass.Endpoint parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static fintekkers.models.util.EndpointOuterClass.Endpoint parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static fintekkers.models.util.EndpointOuterClass.Endpoint parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static fintekkers.models.util.EndpointOuterClass.Endpoint parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static fintekkers.models.util.EndpointOuterClass.Endpoint parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static fintekkers.models.util.EndpointOuterClass.Endpoint parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(fintekkers.models.util.EndpointOuterClass.Endpoint prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code fintekkers.models.util.Endpoint}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:fintekkers.models.util.Endpoint)
        fintekkers.models.util.EndpointOuterClass.EndpointOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return fintekkers.models.util.EndpointOuterClass.internal_static_fintekkers_models_util_Endpoint_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return fintekkers.models.util.EndpointOuterClass.internal_static_fintekkers_models_util_Endpoint_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                fintekkers.models.util.EndpointOuterClass.Endpoint.class, fintekkers.models.util.EndpointOuterClass.Endpoint.Builder.class);
      }

      // Construct using fintekkers.models.util.EndpointOuterClass.Endpoint.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        ip_ = "";

        port_ = 0;

        fullyQualifiedUrl_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return fintekkers.models.util.EndpointOuterClass.internal_static_fintekkers_models_util_Endpoint_descriptor;
      }

      @java.lang.Override
      public fintekkers.models.util.EndpointOuterClass.Endpoint getDefaultInstanceForType() {
        return fintekkers.models.util.EndpointOuterClass.Endpoint.getDefaultInstance();
      }

      @java.lang.Override
      public fintekkers.models.util.EndpointOuterClass.Endpoint build() {
        fintekkers.models.util.EndpointOuterClass.Endpoint result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public fintekkers.models.util.EndpointOuterClass.Endpoint buildPartial() {
        fintekkers.models.util.EndpointOuterClass.Endpoint result = new fintekkers.models.util.EndpointOuterClass.Endpoint(this);
        result.ip_ = ip_;
        result.port_ = port_;
        result.fullyQualifiedUrl_ = fullyQualifiedUrl_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof fintekkers.models.util.EndpointOuterClass.Endpoint) {
          return mergeFrom((fintekkers.models.util.EndpointOuterClass.Endpoint)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(fintekkers.models.util.EndpointOuterClass.Endpoint other) {
        if (other == fintekkers.models.util.EndpointOuterClass.Endpoint.getDefaultInstance()) return this;
        if (!other.getIp().isEmpty()) {
          ip_ = other.ip_;
          onChanged();
        }
        if (other.getPort() != 0) {
          setPort(other.getPort());
        }
        if (!other.getFullyQualifiedUrl().isEmpty()) {
          fullyQualifiedUrl_ = other.fullyQualifiedUrl_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        fintekkers.models.util.EndpointOuterClass.Endpoint parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (fintekkers.models.util.EndpointOuterClass.Endpoint) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object ip_ = "";
      /**
       * <pre>
       *The IP address that an endpoint is exposed through. The assumption is the IP 
       *is exposed to internal clients through VPC/Security rules, or to the public 
       *internet if public-facing
       * </pre>
       *
       * <code>string ip = 1;</code>
       * @return The ip.
       */
      public java.lang.String getIp() {
        java.lang.Object ref = ip_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          ip_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       *The IP address that an endpoint is exposed through. The assumption is the IP 
       *is exposed to internal clients through VPC/Security rules, or to the public 
       *internet if public-facing
       * </pre>
       *
       * <code>string ip = 1;</code>
       * @return The bytes for ip.
       */
      public com.google.protobuf.ByteString
          getIpBytes() {
        java.lang.Object ref = ip_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          ip_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       *The IP address that an endpoint is exposed through. The assumption is the IP 
       *is exposed to internal clients through VPC/Security rules, or to the public 
       *internet if public-facing
       * </pre>
       *
       * <code>string ip = 1;</code>
       * @param value The ip to set.
       * @return This builder for chaining.
       */
      public Builder setIp(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        ip_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *The IP address that an endpoint is exposed through. The assumption is the IP 
       *is exposed to internal clients through VPC/Security rules, or to the public 
       *internet if public-facing
       * </pre>
       *
       * <code>string ip = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearIp() {
        
        ip_ = getDefaultInstance().getIp();
        onChanged();
        return this;
      }
      /**
       * <pre>
       *The IP address that an endpoint is exposed through. The assumption is the IP 
       *is exposed to internal clients through VPC/Security rules, or to the public 
       *internet if public-facing
       * </pre>
       *
       * <code>string ip = 1;</code>
       * @param value The bytes for ip to set.
       * @return This builder for chaining.
       */
      public Builder setIpBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        ip_ = value;
        onChanged();
        return this;
      }

      private int port_ ;
      /**
       * <pre>
       *The port that the service is listening to on the specified IP address.
       * </pre>
       *
       * <code>uint32 port = 2;</code>
       * @return The port.
       */
      @java.lang.Override
      public int getPort() {
        return port_;
      }
      /**
       * <pre>
       *The port that the service is listening to on the specified IP address.
       * </pre>
       *
       * <code>uint32 port = 2;</code>
       * @param value The port to set.
       * @return This builder for chaining.
       */
      public Builder setPort(int value) {
        
        port_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *The port that the service is listening to on the specified IP address.
       * </pre>
       *
       * <code>uint32 port = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearPort() {
        
        port_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object fullyQualifiedUrl_ = "";
      /**
       * <pre>
       *Placeholder for the future. For public-facing traffic a URL will be used, and
       *the resolution to IP occurs via DNS.
       * </pre>
       *
       * <code>string fully_qualified_url = 3;</code>
       * @return The fullyQualifiedUrl.
       */
      public java.lang.String getFullyQualifiedUrl() {
        java.lang.Object ref = fullyQualifiedUrl_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          fullyQualifiedUrl_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       *Placeholder for the future. For public-facing traffic a URL will be used, and
       *the resolution to IP occurs via DNS.
       * </pre>
       *
       * <code>string fully_qualified_url = 3;</code>
       * @return The bytes for fullyQualifiedUrl.
       */
      public com.google.protobuf.ByteString
          getFullyQualifiedUrlBytes() {
        java.lang.Object ref = fullyQualifiedUrl_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          fullyQualifiedUrl_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       *Placeholder for the future. For public-facing traffic a URL will be used, and
       *the resolution to IP occurs via DNS.
       * </pre>
       *
       * <code>string fully_qualified_url = 3;</code>
       * @param value The fullyQualifiedUrl to set.
       * @return This builder for chaining.
       */
      public Builder setFullyQualifiedUrl(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        fullyQualifiedUrl_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *Placeholder for the future. For public-facing traffic a URL will be used, and
       *the resolution to IP occurs via DNS.
       * </pre>
       *
       * <code>string fully_qualified_url = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearFullyQualifiedUrl() {
        
        fullyQualifiedUrl_ = getDefaultInstance().getFullyQualifiedUrl();
        onChanged();
        return this;
      }
      /**
       * <pre>
       *Placeholder for the future. For public-facing traffic a URL will be used, and
       *the resolution to IP occurs via DNS.
       * </pre>
       *
       * <code>string fully_qualified_url = 3;</code>
       * @param value The bytes for fullyQualifiedUrl to set.
       * @return This builder for chaining.
       */
      public Builder setFullyQualifiedUrlBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        fullyQualifiedUrl_ = value;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:fintekkers.models.util.Endpoint)
    }

    // @@protoc_insertion_point(class_scope:fintekkers.models.util.Endpoint)
    private static final fintekkers.models.util.EndpointOuterClass.Endpoint DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new fintekkers.models.util.EndpointOuterClass.Endpoint();
    }

    public static fintekkers.models.util.EndpointOuterClass.Endpoint getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Endpoint>
        PARSER = new com.google.protobuf.AbstractParser<Endpoint>() {
      @java.lang.Override
      public Endpoint parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Endpoint(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Endpoint> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Endpoint> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public fintekkers.models.util.EndpointOuterClass.Endpoint getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_fintekkers_models_util_Endpoint_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_fintekkers_models_util_Endpoint_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%fintekkers/models/util/endpoint.proto\022" +
      "\026fintekkers.models.util\"A\n\010Endpoint\022\n\n\002i" +
      "p\030\001 \001(\t\022\014\n\004port\030\002 \001(\r\022\033\n\023fully_qualified" +
      "_url\030\003 \001(\tb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_fintekkers_models_util_Endpoint_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_fintekkers_models_util_Endpoint_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_fintekkers_models_util_Endpoint_descriptor,
        new java.lang.String[] { "Ip", "Port", "FullyQualifiedUrl", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
