// @generated
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: install.proto

// Protobuf Java Version: 3.25.6
package com.facebook.buck.install.model;

/**
 * Protobuf type {@code install.FileReadyRequest}
 */
@javax.annotation.Generated(value="protoc", comments="annotations:FileReadyRequest.java.pb.meta")
public final class FileReadyRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:install.FileReadyRequest)
    FileReadyRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FileReadyRequest.newBuilder() to construct.
  private FileReadyRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FileReadyRequest() {
    installId_ = "";
    name_ = "";
    sha1_ = "";
    path_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FileReadyRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.facebook.buck.install.model.InstallerProto.internal_static_install_FileReadyRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.facebook.buck.install.model.InstallerProto.internal_static_install_FileReadyRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.facebook.buck.install.model.FileReadyRequest.class, com.facebook.buck.install.model.FileReadyRequest.Builder.class);
  }

  public static final int INSTALL_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object installId_ = "";
  /**
   * <code>string install_id = 1;</code>
   * @return The installId.
   */
  @java.lang.Override
  public java.lang.String getInstallId() {
    java.lang.Object ref = installId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      installId_ = s;
      return s;
    }
  }
  /**
   * <code>string install_id = 1;</code>
   * @return The bytes for installId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getInstallIdBytes() {
    java.lang.Object ref = installId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      installId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NAME_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <code>string name = 2;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SHA1_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object sha1_ = "";
  /**
   * <code>string sha1 = 3;</code>
   * @return The sha1.
   */
  @java.lang.Override
  public java.lang.String getSha1() {
    java.lang.Object ref = sha1_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sha1_ = s;
      return s;
    }
  }
  /**
   * <code>string sha1 = 3;</code>
   * @return The bytes for sha1.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSha1Bytes() {
    java.lang.Object ref = sha1_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      sha1_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PATH_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object path_ = "";
  /**
   * <code>string path = 4;</code>
   * @return The path.
   */
  @java.lang.Override
  public java.lang.String getPath() {
    java.lang.Object ref = path_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      path_ = s;
      return s;
    }
  }
  /**
   * <code>string path = 4;</code>
   * @return The bytes for path.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPathBytes() {
    java.lang.Object ref = path_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      path_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(installId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, installId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sha1_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, sha1_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(path_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, path_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(installId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, installId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sha1_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, sha1_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(path_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, path_);
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
    if (!(obj instanceof com.facebook.buck.install.model.FileReadyRequest)) {
      return super.equals(obj);
    }
    com.facebook.buck.install.model.FileReadyRequest other = (com.facebook.buck.install.model.FileReadyRequest) obj;

    if (!getInstallId()
        .equals(other.getInstallId())) return false;
    if (!getName()
        .equals(other.getName())) return false;
    if (!getSha1()
        .equals(other.getSha1())) return false;
    if (!getPath()
        .equals(other.getPath())) return false;
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
    hash = (37 * hash) + INSTALL_ID_FIELD_NUMBER;
    hash = (53 * hash) + getInstallId().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + SHA1_FIELD_NUMBER;
    hash = (53 * hash) + getSha1().hashCode();
    hash = (37 * hash) + PATH_FIELD_NUMBER;
    hash = (53 * hash) + getPath().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.facebook.buck.install.model.FileReadyRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.facebook.buck.install.model.FileReadyRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.facebook.buck.install.model.FileReadyRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.facebook.buck.install.model.FileReadyRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.facebook.buck.install.model.FileReadyRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.facebook.buck.install.model.FileReadyRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.facebook.buck.install.model.FileReadyRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.facebook.buck.install.model.FileReadyRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.facebook.buck.install.model.FileReadyRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.facebook.buck.install.model.FileReadyRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.facebook.buck.install.model.FileReadyRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.facebook.buck.install.model.FileReadyRequest parseFrom(
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
  public static Builder newBuilder(com.facebook.buck.install.model.FileReadyRequest prototype) {
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
   * Protobuf type {@code install.FileReadyRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:install.FileReadyRequest)
      com.facebook.buck.install.model.FileReadyRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.facebook.buck.install.model.InstallerProto.internal_static_install_FileReadyRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.facebook.buck.install.model.InstallerProto.internal_static_install_FileReadyRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.facebook.buck.install.model.FileReadyRequest.class, com.facebook.buck.install.model.FileReadyRequest.Builder.class);
    }

    // Construct using com.facebook.buck.install.model.FileReadyRequest.newBuilder()
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
      installId_ = "";
      name_ = "";
      sha1_ = "";
      path_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.facebook.buck.install.model.InstallerProto.internal_static_install_FileReadyRequest_descriptor;
    }

    @java.lang.Override
    public com.facebook.buck.install.model.FileReadyRequest getDefaultInstanceForType() {
      return com.facebook.buck.install.model.FileReadyRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.facebook.buck.install.model.FileReadyRequest build() {
      com.facebook.buck.install.model.FileReadyRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.facebook.buck.install.model.FileReadyRequest buildPartial() {
      com.facebook.buck.install.model.FileReadyRequest result = new com.facebook.buck.install.model.FileReadyRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.facebook.buck.install.model.FileReadyRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.installId_ = installId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.sha1_ = sha1_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.path_ = path_;
      }
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
      if (other instanceof com.facebook.buck.install.model.FileReadyRequest) {
        return mergeFrom((com.facebook.buck.install.model.FileReadyRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.facebook.buck.install.model.FileReadyRequest other) {
      if (other == com.facebook.buck.install.model.FileReadyRequest.getDefaultInstance()) return this;
      if (!other.getInstallId().isEmpty()) {
        installId_ = other.installId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getSha1().isEmpty()) {
        sha1_ = other.sha1_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getPath().isEmpty()) {
        path_ = other.path_;
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
              installId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              name_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              sha1_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              path_ = input.readStringRequireUtf8();
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

    private java.lang.Object installId_ = "";
    /**
     * <code>string install_id = 1;</code>
     * @return The installId.
     */
    public java.lang.String getInstallId() {
      java.lang.Object ref = installId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        installId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string install_id = 1;</code>
     * @return The bytes for installId.
     */
    public com.google.protobuf.ByteString
        getInstallIdBytes() {
      java.lang.Object ref = installId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        installId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string install_id = 1;</code>
     * @param value The installId to set.
     * @return This builder for chaining.
     */
    public Builder setInstallId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      installId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string install_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearInstallId() {
      installId_ = getDefaultInstance().getInstallId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string install_id = 1;</code>
     * @param value The bytes for installId to set.
     * @return This builder for chaining.
     */
    public Builder setInstallIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      installId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 2;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 2;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 2;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      name_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string name = 2;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object sha1_ = "";
    /**
     * <code>string sha1 = 3;</code>
     * @return The sha1.
     */
    public java.lang.String getSha1() {
      java.lang.Object ref = sha1_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sha1_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string sha1 = 3;</code>
     * @return The bytes for sha1.
     */
    public com.google.protobuf.ByteString
        getSha1Bytes() {
      java.lang.Object ref = sha1_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sha1_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string sha1 = 3;</code>
     * @param value The sha1 to set.
     * @return This builder for chaining.
     */
    public Builder setSha1(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      sha1_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string sha1 = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearSha1() {
      sha1_ = getDefaultInstance().getSha1();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string sha1 = 3;</code>
     * @param value The bytes for sha1 to set.
     * @return This builder for chaining.
     */
    public Builder setSha1Bytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      sha1_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object path_ = "";
    /**
     * <code>string path = 4;</code>
     * @return The path.
     */
    public java.lang.String getPath() {
      java.lang.Object ref = path_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        path_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string path = 4;</code>
     * @return The bytes for path.
     */
    public com.google.protobuf.ByteString
        getPathBytes() {
      java.lang.Object ref = path_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        path_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string path = 4;</code>
     * @param value The path to set.
     * @return This builder for chaining.
     */
    public Builder setPath(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      path_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>string path = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearPath() {
      path_ = getDefaultInstance().getPath();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <code>string path = 4;</code>
     * @param value The bytes for path to set.
     * @return This builder for chaining.
     */
    public Builder setPathBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      path_ = value;
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


    // @@protoc_insertion_point(builder_scope:install.FileReadyRequest)
  }

  // @@protoc_insertion_point(class_scope:install.FileReadyRequest)
  private static final com.facebook.buck.install.model.FileReadyRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.facebook.buck.install.model.FileReadyRequest();
  }

  public static com.facebook.buck.install.model.FileReadyRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FileReadyRequest>
      PARSER = new com.google.protobuf.AbstractParser<FileReadyRequest>() {
    @java.lang.Override
    public FileReadyRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<FileReadyRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FileReadyRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.facebook.buck.install.model.FileReadyRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

