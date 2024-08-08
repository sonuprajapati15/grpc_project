package com.example.pojo.client_stream;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.51.0)",
    comments = "Source: controller/client_streming.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class BookLiveCartStoreGrpc {

  private BookLiveCartStoreGrpc() {}

  public static final String SERVICE_NAME = "BookLiveCartStore";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.pojo.serverstream.ServerStreaming.Book,
      com.example.pojo.client_stream.ClientStreming.Cart> getLiveCartValueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "liveCartValue",
      requestType = com.example.pojo.serverstream.ServerStreaming.Book.class,
      responseType = com.example.pojo.client_stream.ClientStreming.Cart.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.example.pojo.serverstream.ServerStreaming.Book,
      com.example.pojo.client_stream.ClientStreming.Cart> getLiveCartValueMethod() {
    io.grpc.MethodDescriptor<com.example.pojo.serverstream.ServerStreaming.Book, com.example.pojo.client_stream.ClientStreming.Cart> getLiveCartValueMethod;
    if ((getLiveCartValueMethod = BookLiveCartStoreGrpc.getLiveCartValueMethod) == null) {
      synchronized (BookLiveCartStoreGrpc.class) {
        if ((getLiveCartValueMethod = BookLiveCartStoreGrpc.getLiveCartValueMethod) == null) {
          BookLiveCartStoreGrpc.getLiveCartValueMethod = getLiveCartValueMethod =
              io.grpc.MethodDescriptor.<com.example.pojo.serverstream.ServerStreaming.Book, com.example.pojo.client_stream.ClientStreming.Cart>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "liveCartValue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.pojo.serverstream.ServerStreaming.Book.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.pojo.client_stream.ClientStreming.Cart.getDefaultInstance()))
              .setSchemaDescriptor(new BookLiveCartStoreMethodDescriptorSupplier("liveCartValue"))
              .build();
        }
      }
    }
    return getLiveCartValueMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BookLiveCartStoreStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BookLiveCartStoreStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BookLiveCartStoreStub>() {
        @java.lang.Override
        public BookLiveCartStoreStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BookLiveCartStoreStub(channel, callOptions);
        }
      };
    return BookLiveCartStoreStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BookLiveCartStoreBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BookLiveCartStoreBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BookLiveCartStoreBlockingStub>() {
        @java.lang.Override
        public BookLiveCartStoreBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BookLiveCartStoreBlockingStub(channel, callOptions);
        }
      };
    return BookLiveCartStoreBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BookLiveCartStoreFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BookLiveCartStoreFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BookLiveCartStoreFutureStub>() {
        @java.lang.Override
        public BookLiveCartStoreFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BookLiveCartStoreFutureStub(channel, callOptions);
        }
      };
    return BookLiveCartStoreFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class BookLiveCartStoreImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<com.example.pojo.serverstream.ServerStreaming.Book> liveCartValue(
        io.grpc.stub.StreamObserver<com.example.pojo.client_stream.ClientStreming.Cart> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getLiveCartValueMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getLiveCartValueMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                com.example.pojo.serverstream.ServerStreaming.Book,
                com.example.pojo.client_stream.ClientStreming.Cart>(
                  this, METHODID_LIVE_CART_VALUE)))
          .build();
    }
  }

  /**
   */
  public static final class BookLiveCartStoreStub extends io.grpc.stub.AbstractAsyncStub<BookLiveCartStoreStub> {
    private BookLiveCartStoreStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookLiveCartStoreStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BookLiveCartStoreStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.example.pojo.serverstream.ServerStreaming.Book> liveCartValue(
        io.grpc.stub.StreamObserver<com.example.pojo.client_stream.ClientStreming.Cart> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getLiveCartValueMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class BookLiveCartStoreBlockingStub extends io.grpc.stub.AbstractBlockingStub<BookLiveCartStoreBlockingStub> {
    private BookLiveCartStoreBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookLiveCartStoreBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BookLiveCartStoreBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class BookLiveCartStoreFutureStub extends io.grpc.stub.AbstractFutureStub<BookLiveCartStoreFutureStub> {
    private BookLiveCartStoreFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookLiveCartStoreFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BookLiveCartStoreFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_LIVE_CART_VALUE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BookLiveCartStoreImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BookLiveCartStoreImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIVE_CART_VALUE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.liveCartValue(
              (io.grpc.stub.StreamObserver<com.example.pojo.client_stream.ClientStreming.Cart>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class BookLiveCartStoreBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BookLiveCartStoreBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.pojo.client_stream.ClientStreming.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BookLiveCartStore");
    }
  }

  private static final class BookLiveCartStoreFileDescriptorSupplier
      extends BookLiveCartStoreBaseDescriptorSupplier {
    BookLiveCartStoreFileDescriptorSupplier() {}
  }

  private static final class BookLiveCartStoreMethodDescriptorSupplier
      extends BookLiveCartStoreBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BookLiveCartStoreMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (BookLiveCartStoreGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BookLiveCartStoreFileDescriptorSupplier())
              .addMethod(getLiveCartValueMethod())
              .build();
        }
      }
    }
    return result;
  }
}
