package com.example.pojo.client_stream;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.51.0)",
    comments = "Source: controller/client_streming.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class BookCartStoreGrpc {

  private BookCartStoreGrpc() {}

  public static final String SERVICE_NAME = "BookCartStore";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.pojo.serverstream.ServerStreaming.Book,
      com.example.pojo.client_stream.ClientStreming.Cart> getTotalCartValueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "totalCartValue",
      requestType = com.example.pojo.serverstream.ServerStreaming.Book.class,
      responseType = com.example.pojo.client_stream.ClientStreming.Cart.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.example.pojo.serverstream.ServerStreaming.Book,
      com.example.pojo.client_stream.ClientStreming.Cart> getTotalCartValueMethod() {
    io.grpc.MethodDescriptor<com.example.pojo.serverstream.ServerStreaming.Book, com.example.pojo.client_stream.ClientStreming.Cart> getTotalCartValueMethod;
    if ((getTotalCartValueMethod = BookCartStoreGrpc.getTotalCartValueMethod) == null) {
      synchronized (BookCartStoreGrpc.class) {
        if ((getTotalCartValueMethod = BookCartStoreGrpc.getTotalCartValueMethod) == null) {
          BookCartStoreGrpc.getTotalCartValueMethod = getTotalCartValueMethod =
              io.grpc.MethodDescriptor.<com.example.pojo.serverstream.ServerStreaming.Book, com.example.pojo.client_stream.ClientStreming.Cart>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "totalCartValue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.pojo.serverstream.ServerStreaming.Book.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.pojo.client_stream.ClientStreming.Cart.getDefaultInstance()))
              .setSchemaDescriptor(new BookCartStoreMethodDescriptorSupplier("totalCartValue"))
              .build();
        }
      }
    }
    return getTotalCartValueMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BookCartStoreStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BookCartStoreStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BookCartStoreStub>() {
        @java.lang.Override
        public BookCartStoreStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BookCartStoreStub(channel, callOptions);
        }
      };
    return BookCartStoreStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BookCartStoreBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BookCartStoreBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BookCartStoreBlockingStub>() {
        @java.lang.Override
        public BookCartStoreBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BookCartStoreBlockingStub(channel, callOptions);
        }
      };
    return BookCartStoreBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BookCartStoreFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BookCartStoreFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BookCartStoreFutureStub>() {
        @java.lang.Override
        public BookCartStoreFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BookCartStoreFutureStub(channel, callOptions);
        }
      };
    return BookCartStoreFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class BookCartStoreImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<com.example.pojo.serverstream.ServerStreaming.Book> totalCartValue(
        io.grpc.stub.StreamObserver<com.example.pojo.client_stream.ClientStreming.Cart> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getTotalCartValueMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getTotalCartValueMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                com.example.pojo.serverstream.ServerStreaming.Book,
                com.example.pojo.client_stream.ClientStreming.Cart>(
                  this, METHODID_TOTAL_CART_VALUE)))
          .build();
    }
  }

  /**
   */
  public static final class BookCartStoreStub extends io.grpc.stub.AbstractAsyncStub<BookCartStoreStub> {
    private BookCartStoreStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookCartStoreStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BookCartStoreStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.example.pojo.serverstream.ServerStreaming.Book> totalCartValue(
        io.grpc.stub.StreamObserver<com.example.pojo.client_stream.ClientStreming.Cart> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getTotalCartValueMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class BookCartStoreBlockingStub extends io.grpc.stub.AbstractBlockingStub<BookCartStoreBlockingStub> {
    private BookCartStoreBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookCartStoreBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BookCartStoreBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class BookCartStoreFutureStub extends io.grpc.stub.AbstractFutureStub<BookCartStoreFutureStub> {
    private BookCartStoreFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookCartStoreFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BookCartStoreFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_TOTAL_CART_VALUE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BookCartStoreImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BookCartStoreImplBase serviceImpl, int methodId) {
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
        case METHODID_TOTAL_CART_VALUE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.totalCartValue(
              (io.grpc.stub.StreamObserver<com.example.pojo.client_stream.ClientStreming.Cart>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class BookCartStoreBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BookCartStoreBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.pojo.client_stream.ClientStreming.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BookCartStore");
    }
  }

  private static final class BookCartStoreFileDescriptorSupplier
      extends BookCartStoreBaseDescriptorSupplier {
    BookCartStoreFileDescriptorSupplier() {}
  }

  private static final class BookCartStoreMethodDescriptorSupplier
      extends BookCartStoreBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BookCartStoreMethodDescriptorSupplier(String methodName) {
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
      synchronized (BookCartStoreGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BookCartStoreFileDescriptorSupplier())
              .addMethod(getTotalCartValueMethod())
              .build();
        }
      }
    }
    return result;
  }
}
