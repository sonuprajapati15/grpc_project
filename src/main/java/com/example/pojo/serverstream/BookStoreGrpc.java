package com.example.pojo.serverstream;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.51.0)",
    comments = "Source: controller/server_streaming.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class BookStoreGrpc {

  private BookStoreGrpc() {}

  public static final String SERVICE_NAME = "BookStore";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.pojo.serverstream.ServerStreaming.BookSearch,
      com.example.pojo.serverstream.ServerStreaming.Book> getSearchByAuthorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "searchByAuthor",
      requestType = com.example.pojo.serverstream.ServerStreaming.BookSearch.class,
      responseType = com.example.pojo.serverstream.ServerStreaming.Book.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.example.pojo.serverstream.ServerStreaming.BookSearch,
      com.example.pojo.serverstream.ServerStreaming.Book> getSearchByAuthorMethod() {
    io.grpc.MethodDescriptor<com.example.pojo.serverstream.ServerStreaming.BookSearch, com.example.pojo.serverstream.ServerStreaming.Book> getSearchByAuthorMethod;
    if ((getSearchByAuthorMethod = BookStoreGrpc.getSearchByAuthorMethod) == null) {
      synchronized (BookStoreGrpc.class) {
        if ((getSearchByAuthorMethod = BookStoreGrpc.getSearchByAuthorMethod) == null) {
          BookStoreGrpc.getSearchByAuthorMethod = getSearchByAuthorMethod =
              io.grpc.MethodDescriptor.<com.example.pojo.serverstream.ServerStreaming.BookSearch, com.example.pojo.serverstream.ServerStreaming.Book>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "searchByAuthor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.pojo.serverstream.ServerStreaming.BookSearch.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.pojo.serverstream.ServerStreaming.Book.getDefaultInstance()))
              .setSchemaDescriptor(new BookStoreMethodDescriptorSupplier("searchByAuthor"))
              .build();
        }
      }
    }
    return getSearchByAuthorMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BookStoreStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BookStoreStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BookStoreStub>() {
        @java.lang.Override
        public BookStoreStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BookStoreStub(channel, callOptions);
        }
      };
    return BookStoreStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BookStoreBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BookStoreBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BookStoreBlockingStub>() {
        @java.lang.Override
        public BookStoreBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BookStoreBlockingStub(channel, callOptions);
        }
      };
    return BookStoreBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BookStoreFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BookStoreFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BookStoreFutureStub>() {
        @java.lang.Override
        public BookStoreFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BookStoreFutureStub(channel, callOptions);
        }
      };
    return BookStoreFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class BookStoreImplBase implements io.grpc.BindableService {

    /**
     */
    public void searchByAuthor(com.example.pojo.serverstream.ServerStreaming.BookSearch request,
        io.grpc.stub.StreamObserver<com.example.pojo.serverstream.ServerStreaming.Book> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchByAuthorMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSearchByAuthorMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.example.pojo.serverstream.ServerStreaming.BookSearch,
                com.example.pojo.serverstream.ServerStreaming.Book>(
                  this, METHODID_SEARCH_BY_AUTHOR)))
          .build();
    }
  }

  /**
   */
  public static final class BookStoreStub extends io.grpc.stub.AbstractAsyncStub<BookStoreStub> {
    private BookStoreStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookStoreStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BookStoreStub(channel, callOptions);
    }

    /**
     */
    public void searchByAuthor(com.example.pojo.serverstream.ServerStreaming.BookSearch request,
        io.grpc.stub.StreamObserver<com.example.pojo.serverstream.ServerStreaming.Book> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSearchByAuthorMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class BookStoreBlockingStub extends io.grpc.stub.AbstractBlockingStub<BookStoreBlockingStub> {
    private BookStoreBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookStoreBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BookStoreBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<com.example.pojo.serverstream.ServerStreaming.Book> searchByAuthor(
        com.example.pojo.serverstream.ServerStreaming.BookSearch request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSearchByAuthorMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BookStoreFutureStub extends io.grpc.stub.AbstractFutureStub<BookStoreFutureStub> {
    private BookStoreFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookStoreFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BookStoreFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_SEARCH_BY_AUTHOR = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BookStoreImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BookStoreImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEARCH_BY_AUTHOR:
          serviceImpl.searchByAuthor((com.example.pojo.serverstream.ServerStreaming.BookSearch) request,
              (io.grpc.stub.StreamObserver<com.example.pojo.serverstream.ServerStreaming.Book>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class BookStoreBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BookStoreBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.pojo.serverstream.ServerStreaming.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BookStore");
    }
  }

  private static final class BookStoreFileDescriptorSupplier
      extends BookStoreBaseDescriptorSupplier {
    BookStoreFileDescriptorSupplier() {}
  }

  private static final class BookStoreMethodDescriptorSupplier
      extends BookStoreBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BookStoreMethodDescriptorSupplier(String methodName) {
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
      synchronized (BookStoreGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BookStoreFileDescriptorSupplier())
              .addMethod(getSearchByAuthorMethod())
              .build();
        }
      }
    }
    return result;
  }
}
