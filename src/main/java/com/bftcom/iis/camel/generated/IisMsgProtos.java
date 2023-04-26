// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IisMsg.proto

package com.bftcom.iis.camel.generated;

public final class IisMsgProtos {
  private IisMsgProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RequestMsgOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.bftcom.iis.camel.RequestMsg)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string dtsend = 1;</code>
     * @return The dtsend.
     */
    java.lang.String getDtsend();
    /**
     * <code>string dtsend = 1;</code>
     * @return The bytes for dtsend.
     */
    com.google.protobuf.ByteString
        getDtsendBytes();

    /**
     * <code>string dtrecieved = 2;</code>
     * @return The dtrecieved.
     */
    java.lang.String getDtrecieved();
    /**
     * <code>string dtrecieved = 2;</code>
     * @return The bytes for dtrecieved.
     */
    com.google.protobuf.ByteString
        getDtrecievedBytes();

    /**
     * <code>string ip = 3;</code>
     * @return The ip.
     */
    java.lang.String getIp();
    /**
     * <code>string ip = 3;</code>
     * @return The bytes for ip.
     */
    com.google.protobuf.ByteString
        getIpBytes();

    /**
     * <code>string guid = 4;</code>
     * @return The guid.
     */
    java.lang.String getGuid();
    /**
     * <code>string guid = 4;</code>
     * @return The bytes for guid.
     */
    com.google.protobuf.ByteString
        getGuidBytes();
  }
  /**
   * Protobuf type {@code com.bftcom.iis.camel.RequestMsg}
   */
  public static final class RequestMsg extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:com.bftcom.iis.camel.RequestMsg)
      RequestMsgOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RequestMsg.newBuilder() to construct.
    private RequestMsg(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RequestMsg() {
      dtsend_ = "";
      dtrecieved_ = "";
      ip_ = "";
      guid_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new RequestMsg();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.bftcom.iis.camel.generated.IisMsgProtos.internal_static_com_bftcom_iis_camel_RequestMsg_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.bftcom.iis.camel.generated.IisMsgProtos.internal_static_com_bftcom_iis_camel_RequestMsg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.bftcom.iis.camel.generated.IisMsgProtos.RequestMsg.class, com.bftcom.iis.camel.generated.IisMsgProtos.RequestMsg.Builder.class);
    }

    public static final int DTSEND_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private volatile java.lang.Object dtsend_ = "";
    /**
     * <code>string dtsend = 1;</code>
     * @return The dtsend.
     */
    @java.lang.Override
    public java.lang.String getDtsend() {
      java.lang.Object ref = dtsend_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dtsend_ = s;
        return s;
      }
    }
    /**
     * <code>string dtsend = 1;</code>
     * @return The bytes for dtsend.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getDtsendBytes() {
      java.lang.Object ref = dtsend_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        dtsend_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int DTRECIEVED_FIELD_NUMBER = 2;
    @SuppressWarnings("serial")
    private volatile java.lang.Object dtrecieved_ = "";
    /**
     * <code>string dtrecieved = 2;</code>
     * @return The dtrecieved.
     */
    @java.lang.Override
    public java.lang.String getDtrecieved() {
      java.lang.Object ref = dtrecieved_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dtrecieved_ = s;
        return s;
      }
    }
    /**
     * <code>string dtrecieved = 2;</code>
     * @return The bytes for dtrecieved.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getDtrecievedBytes() {
      java.lang.Object ref = dtrecieved_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        dtrecieved_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int IP_FIELD_NUMBER = 3;
    @SuppressWarnings("serial")
    private volatile java.lang.Object ip_ = "";
    /**
     * <code>string ip = 3;</code>
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
     * <code>string ip = 3;</code>
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

    public static final int GUID_FIELD_NUMBER = 4;
    @SuppressWarnings("serial")
    private volatile java.lang.Object guid_ = "";
    /**
     * <code>string guid = 4;</code>
     * @return The guid.
     */
    @java.lang.Override
    public java.lang.String getGuid() {
      java.lang.Object ref = guid_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        guid_ = s;
        return s;
      }
    }
    /**
     * <code>string guid = 4;</code>
     * @return The bytes for guid.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getGuidBytes() {
      java.lang.Object ref = guid_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        guid_ = b;
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
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dtsend_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, dtsend_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dtrecieved_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, dtrecieved_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(ip_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, ip_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(guid_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, guid_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dtsend_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, dtsend_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dtrecieved_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, dtrecieved_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(ip_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, ip_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(guid_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, guid_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.bftcom.iis.camel.generated.IisMsgProtos.RequestMsg)) {
        return super.equals(obj);
      }
      com.bftcom.iis.camel.generated.IisMsgProtos.RequestMsg other = (com.bftcom.iis.camel.generated.IisMsgProtos.RequestMsg) obj;

      if (!getDtsend()
          .equals(other.getDtsend())) return false;
      if (!getDtrecieved()
          .equals(other.getDtrecieved())) return false;
      if (!getIp()
          .equals(other.getIp())) return false;
      if (!getGuid()
          .equals(other.getGuid())) return false;
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + DTSEND_FIELD_NUMBER;
      hash = (53 * hash) + getDtsend().hashCode();
      hash = (37 * hash) + DTRECIEVED_FIELD_NUMBER;
      hash = (53 * hash) + getDtrecieved().hashCode();
      hash = (37 * hash) + IP_FIELD_NUMBER;
      hash = (53 * hash) + getIp().hashCode();
      hash = (37 * hash) + GUID_FIELD_NUMBER;
      hash = (53 * hash) + getGuid().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.bftcom.iis.camel.generated.IisMsgProtos.RequestMsg parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.bftcom.iis.camel.generated.IisMsgProtos.RequestMsg parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.bftcom.iis.camel.generated.IisMsgProtos.RequestMsg parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.bftcom.iis.camel.generated.IisMsgProtos.RequestMsg parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.bftcom.iis.camel.generated.IisMsgProtos.RequestMsg parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.bftcom.iis.camel.generated.IisMsgProtos.RequestMsg parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.bftcom.iis.camel.generated.IisMsgProtos.RequestMsg parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.bftcom.iis.camel.generated.IisMsgProtos.RequestMsg parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.bftcom.iis.camel.generated.IisMsgProtos.RequestMsg parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.bftcom.iis.camel.generated.IisMsgProtos.RequestMsg parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.bftcom.iis.camel.generated.IisMsgProtos.RequestMsg parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.bftcom.iis.camel.generated.IisMsgProtos.RequestMsg parseFrom(
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
    public static Builder newBuilder(com.bftcom.iis.camel.generated.IisMsgProtos.RequestMsg prototype) {
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
     * Protobuf type {@code com.bftcom.iis.camel.RequestMsg}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.bftcom.iis.camel.RequestMsg)
        com.bftcom.iis.camel.generated.IisMsgProtos.RequestMsgOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.bftcom.iis.camel.generated.IisMsgProtos.internal_static_com_bftcom_iis_camel_RequestMsg_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.bftcom.iis.camel.generated.IisMsgProtos.internal_static_com_bftcom_iis_camel_RequestMsg_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.bftcom.iis.camel.generated.IisMsgProtos.RequestMsg.class, com.bftcom.iis.camel.generated.IisMsgProtos.RequestMsg.Builder.class);
      }

      // Construct using com.bftcom.iis.camel.generated.IisMsgProtos.RequestMsg.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        dtsend_ = "";
        dtrecieved_ = "";
        ip_ = "";
        guid_ = "";
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.bftcom.iis.camel.generated.IisMsgProtos.internal_static_com_bftcom_iis_camel_RequestMsg_descriptor;
      }

      @java.lang.Override
      public com.bftcom.iis.camel.generated.IisMsgProtos.RequestMsg getDefaultInstanceForType() {
        return com.bftcom.iis.camel.generated.IisMsgProtos.RequestMsg.getDefaultInstance();
      }

      @java.lang.Override
      public com.bftcom.iis.camel.generated.IisMsgProtos.RequestMsg build() {
        com.bftcom.iis.camel.generated.IisMsgProtos.RequestMsg result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.bftcom.iis.camel.generated.IisMsgProtos.RequestMsg buildPartial() {
        com.bftcom.iis.camel.generated.IisMsgProtos.RequestMsg result = new com.bftcom.iis.camel.generated.IisMsgProtos.RequestMsg(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(com.bftcom.iis.camel.generated.IisMsgProtos.RequestMsg result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.dtsend_ = dtsend_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.dtrecieved_ = dtrecieved_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.ip_ = ip_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.guid_ = guid_;
        }
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.bftcom.iis.camel.generated.IisMsgProtos.RequestMsg) {
          return mergeFrom((com.bftcom.iis.camel.generated.IisMsgProtos.RequestMsg)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.bftcom.iis.camel.generated.IisMsgProtos.RequestMsg other) {
        if (other == com.bftcom.iis.camel.generated.IisMsgProtos.RequestMsg.getDefaultInstance()) return this;
        if (!other.getDtsend().isEmpty()) {
          dtsend_ = other.dtsend_;
          bitField0_ |= 0x00000001;
          onChanged();
        }
        if (!other.getDtrecieved().isEmpty()) {
          dtrecieved_ = other.dtrecieved_;
          bitField0_ |= 0x00000002;
          onChanged();
        }
        if (!other.getIp().isEmpty()) {
          ip_ = other.ip_;
          bitField0_ |= 0x00000004;
          onChanged();
        }
        if (!other.getGuid().isEmpty()) {
          guid_ = other.guid_;
          bitField0_ |= 0x00000008;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
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
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 10: {
                dtsend_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 18: {
                dtrecieved_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
              case 26: {
                ip_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 26
              case 34: {
                guid_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000008;
                break;
              } // case 34
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private java.lang.Object dtsend_ = "";
      /**
       * <code>string dtsend = 1;</code>
       * @return The dtsend.
       */
      public java.lang.String getDtsend() {
        java.lang.Object ref = dtsend_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          dtsend_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string dtsend = 1;</code>
       * @return The bytes for dtsend.
       */
      public com.google.protobuf.ByteString
          getDtsendBytes() {
        java.lang.Object ref = dtsend_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          dtsend_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string dtsend = 1;</code>
       * @param value The dtsend to set.
       * @return This builder for chaining.
       */
      public Builder setDtsend(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        dtsend_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>string dtsend = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearDtsend() {
        dtsend_ = getDefaultInstance().getDtsend();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <code>string dtsend = 1;</code>
       * @param value The bytes for dtsend to set.
       * @return This builder for chaining.
       */
      public Builder setDtsendBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        dtsend_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }

      private java.lang.Object dtrecieved_ = "";
      /**
       * <code>string dtrecieved = 2;</code>
       * @return The dtrecieved.
       */
      public java.lang.String getDtrecieved() {
        java.lang.Object ref = dtrecieved_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          dtrecieved_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string dtrecieved = 2;</code>
       * @return The bytes for dtrecieved.
       */
      public com.google.protobuf.ByteString
          getDtrecievedBytes() {
        java.lang.Object ref = dtrecieved_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          dtrecieved_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string dtrecieved = 2;</code>
       * @param value The dtrecieved to set.
       * @return This builder for chaining.
       */
      public Builder setDtrecieved(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        dtrecieved_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>string dtrecieved = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearDtrecieved() {
        dtrecieved_ = getDefaultInstance().getDtrecieved();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       * <code>string dtrecieved = 2;</code>
       * @param value The bytes for dtrecieved to set.
       * @return This builder for chaining.
       */
      public Builder setDtrecievedBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        dtrecieved_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }

      private java.lang.Object ip_ = "";
      /**
       * <code>string ip = 3;</code>
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
       * <code>string ip = 3;</code>
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
       * <code>string ip = 3;</code>
       * @param value The ip to set.
       * @return This builder for chaining.
       */
      public Builder setIp(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        ip_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>string ip = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearIp() {
        ip_ = getDefaultInstance().getIp();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
        return this;
      }
      /**
       * <code>string ip = 3;</code>
       * @param value The bytes for ip to set.
       * @return This builder for chaining.
       */
      public Builder setIpBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        ip_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }

      private java.lang.Object guid_ = "";
      /**
       * <code>string guid = 4;</code>
       * @return The guid.
       */
      public java.lang.String getGuid() {
        java.lang.Object ref = guid_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          guid_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string guid = 4;</code>
       * @return The bytes for guid.
       */
      public com.google.protobuf.ByteString
          getGuidBytes() {
        java.lang.Object ref = guid_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          guid_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string guid = 4;</code>
       * @param value The guid to set.
       * @return This builder for chaining.
       */
      public Builder setGuid(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        guid_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>string guid = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearGuid() {
        guid_ = getDefaultInstance().getGuid();
        bitField0_ = (bitField0_ & ~0x00000008);
        onChanged();
        return this;
      }
      /**
       * <code>string guid = 4;</code>
       * @param value The bytes for guid to set.
       * @return This builder for chaining.
       */
      public Builder setGuidBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        guid_ = value;
        bitField0_ |= 0x00000008;
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


      // @@protoc_insertion_point(builder_scope:com.bftcom.iis.camel.RequestMsg)
    }

    // @@protoc_insertion_point(class_scope:com.bftcom.iis.camel.RequestMsg)
    private static final com.bftcom.iis.camel.generated.IisMsgProtos.RequestMsg DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.bftcom.iis.camel.generated.IisMsgProtos.RequestMsg();
    }

    public static com.bftcom.iis.camel.generated.IisMsgProtos.RequestMsg getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RequestMsg>
        PARSER = new com.google.protobuf.AbstractParser<RequestMsg>() {
      @java.lang.Override
      public RequestMsg parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<RequestMsg> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RequestMsg> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.bftcom.iis.camel.generated.IisMsgProtos.RequestMsg getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_bftcom_iis_camel_RequestMsg_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_bftcom_iis_camel_RequestMsg_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014IisMsg.proto\022\024com.bftcom.iis.camel\"J\n\n" +
      "RequestMsg\022\016\n\006dtsend\030\001 \001(\t\022\022\n\ndtrecieved" +
      "\030\002 \001(\t\022\n\n\002ip\030\003 \001(\t\022\014\n\004guid\030\004 \001(\tB.\n\036com." +
      "bftcom.iis.camel.generatedB\014IisMsgProtos" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_bftcom_iis_camel_RequestMsg_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_bftcom_iis_camel_RequestMsg_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_bftcom_iis_camel_RequestMsg_descriptor,
        new java.lang.String[] { "Dtsend", "Dtrecieved", "Ip", "Guid", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
