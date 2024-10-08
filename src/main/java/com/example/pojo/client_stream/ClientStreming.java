// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: controller/client_streming.proto

package com.example.pojo.client_stream;

public final class ClientStreming {
  private ClientStreming() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CartOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Cart)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 books = 1;</code>
     * @return The books.
     */
    int getBooks();

    /**
     * <code>int32 price = 2;</code>
     * @return The price.
     */
    int getPrice();
  }
  /**
   * Protobuf type {@code Cart}
   */
  public static final class Cart extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Cart)
      CartOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Cart.newBuilder() to construct.
    private Cart(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Cart() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Cart();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.pojo.client_stream.ClientStreming.internal_static_Cart_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.pojo.client_stream.ClientStreming.internal_static_Cart_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.pojo.client_stream.ClientStreming.Cart.class, com.example.pojo.client_stream.ClientStreming.Cart.Builder.class);
    }

    public static final int BOOKS_FIELD_NUMBER = 1;
    private int books_;
    /**
     * <code>int32 books = 1;</code>
     * @return The books.
     */
    @java.lang.Override
    public int getBooks() {
      return books_;
    }

    public static final int PRICE_FIELD_NUMBER = 2;
    private int price_;
    /**
     * <code>int32 price = 2;</code>
     * @return The price.
     */
    @java.lang.Override
    public int getPrice() {
      return price_;
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
      if (books_ != 0) {
        output.writeInt32(1, books_);
      }
      if (price_ != 0) {
        output.writeInt32(2, price_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (books_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, books_);
      }
      if (price_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, price_);
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
      if (!(obj instanceof com.example.pojo.client_stream.ClientStreming.Cart)) {
        return super.equals(obj);
      }
      com.example.pojo.client_stream.ClientStreming.Cart other = (com.example.pojo.client_stream.ClientStreming.Cart) obj;

      if (getBooks()
          != other.getBooks()) return false;
      if (getPrice()
          != other.getPrice()) return false;
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
      hash = (37 * hash) + BOOKS_FIELD_NUMBER;
      hash = (53 * hash) + getBooks();
      hash = (37 * hash) + PRICE_FIELD_NUMBER;
      hash = (53 * hash) + getPrice();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.example.pojo.client_stream.ClientStreming.Cart parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.example.pojo.client_stream.ClientStreming.Cart parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.example.pojo.client_stream.ClientStreming.Cart parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.example.pojo.client_stream.ClientStreming.Cart parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.example.pojo.client_stream.ClientStreming.Cart parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.example.pojo.client_stream.ClientStreming.Cart parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.example.pojo.client_stream.ClientStreming.Cart parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.example.pojo.client_stream.ClientStreming.Cart parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.example.pojo.client_stream.ClientStreming.Cart parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.example.pojo.client_stream.ClientStreming.Cart parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.example.pojo.client_stream.ClientStreming.Cart parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.example.pojo.client_stream.ClientStreming.Cart parseFrom(
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
    public static Builder newBuilder(com.example.pojo.client_stream.ClientStreming.Cart prototype) {
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
     * Protobuf type {@code Cart}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Cart)
        com.example.pojo.client_stream.ClientStreming.CartOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.example.pojo.client_stream.ClientStreming.internal_static_Cart_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.example.pojo.client_stream.ClientStreming.internal_static_Cart_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.example.pojo.client_stream.ClientStreming.Cart.class, com.example.pojo.client_stream.ClientStreming.Cart.Builder.class);
      }

      // Construct using com.example.pojo.client_stream.ClientStreming.Cart.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        books_ = 0;

        price_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.example.pojo.client_stream.ClientStreming.internal_static_Cart_descriptor;
      }

      @java.lang.Override
      public com.example.pojo.client_stream.ClientStreming.Cart getDefaultInstanceForType() {
        return com.example.pojo.client_stream.ClientStreming.Cart.getDefaultInstance();
      }

      @java.lang.Override
      public com.example.pojo.client_stream.ClientStreming.Cart build() {
        com.example.pojo.client_stream.ClientStreming.Cart result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.example.pojo.client_stream.ClientStreming.Cart buildPartial() {
        com.example.pojo.client_stream.ClientStreming.Cart result = new com.example.pojo.client_stream.ClientStreming.Cart(this);
        result.books_ = books_;
        result.price_ = price_;
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
        if (other instanceof com.example.pojo.client_stream.ClientStreming.Cart) {
          return mergeFrom((com.example.pojo.client_stream.ClientStreming.Cart)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.example.pojo.client_stream.ClientStreming.Cart other) {
        if (other == com.example.pojo.client_stream.ClientStreming.Cart.getDefaultInstance()) return this;
        if (other.getBooks() != 0) {
          setBooks(other.getBooks());
        }
        if (other.getPrice() != 0) {
          setPrice(other.getPrice());
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
              case 8: {
                books_ = input.readInt32();

                break;
              } // case 8
              case 16: {
                price_ = input.readInt32();

                break;
              } // case 16
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

      private int books_ ;
      /**
       * <code>int32 books = 1;</code>
       * @return The books.
       */
      @java.lang.Override
      public int getBooks() {
        return books_;
      }
      /**
       * <code>int32 books = 1;</code>
       * @param value The books to set.
       * @return This builder for chaining.
       */
      public Builder setBooks(int value) {
        
        books_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 books = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearBooks() {
        
        books_ = 0;
        onChanged();
        return this;
      }

      private int price_ ;
      /**
       * <code>int32 price = 2;</code>
       * @return The price.
       */
      @java.lang.Override
      public int getPrice() {
        return price_;
      }
      /**
       * <code>int32 price = 2;</code>
       * @param value The price to set.
       * @return This builder for chaining.
       */
      public Builder setPrice(int value) {
        
        price_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 price = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearPrice() {
        
        price_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Cart)
    }

    // @@protoc_insertion_point(class_scope:Cart)
    private static final com.example.pojo.client_stream.ClientStreming.Cart DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.example.pojo.client_stream.ClientStreming.Cart();
    }

    public static com.example.pojo.client_stream.ClientStreming.Cart getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Cart>
        PARSER = new com.google.protobuf.AbstractParser<Cart>() {
      @java.lang.Override
      public Cart parsePartialFrom(
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

    public static com.google.protobuf.Parser<Cart> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Cart> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.example.pojo.client_stream.ClientStreming.Cart getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Cart_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Cart_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n controller/client_streming.proto\032!cont" +
      "roller/server_streaming.proto\"$\n\004Cart\022\r\n" +
      "\005books\030\001 \001(\005\022\r\n\005price\030\002 \001(\00523\n\rBookCartS" +
      "tore\022\"\n\016totalCartValue\022\005.Book\032\005.Cart\"\000(\001" +
      "28\n\021BookLiveCartStore\022#\n\rliveCartValue\022\005" +
      ".Book\032\005.Cart\"\000(\0010\001B \n\036com.example.pojo.c" +
      "lient_streamb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.example.pojo.serverstream.ServerStreaming.getDescriptor(),
        });
    internal_static_Cart_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Cart_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Cart_descriptor,
        new java.lang.String[] { "Books", "Price", });
    com.example.pojo.serverstream.ServerStreaming.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
