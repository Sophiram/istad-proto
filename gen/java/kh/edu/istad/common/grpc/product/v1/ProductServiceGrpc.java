package kh.edu.istad.common.grpc.product.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class ProductServiceGrpc {

  private ProductServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "istad.product.v1.ProductService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<kh.edu.istad.common.grpc.product.v1.GetProductRequest,
      kh.edu.istad.common.grpc.product.v1.Product> getGetProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProduct",
      requestType = kh.edu.istad.common.grpc.product.v1.GetProductRequest.class,
      responseType = kh.edu.istad.common.grpc.product.v1.Product.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kh.edu.istad.common.grpc.product.v1.GetProductRequest,
      kh.edu.istad.common.grpc.product.v1.Product> getGetProductMethod() {
    io.grpc.MethodDescriptor<kh.edu.istad.common.grpc.product.v1.GetProductRequest, kh.edu.istad.common.grpc.product.v1.Product> getGetProductMethod;
    if ((getGetProductMethod = ProductServiceGrpc.getGetProductMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getGetProductMethod = ProductServiceGrpc.getGetProductMethod) == null) {
          ProductServiceGrpc.getGetProductMethod = getGetProductMethod =
              io.grpc.MethodDescriptor.<kh.edu.istad.common.grpc.product.v1.GetProductRequest, kh.edu.istad.common.grpc.product.v1.Product>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kh.edu.istad.common.grpc.product.v1.GetProductRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kh.edu.istad.common.grpc.product.v1.Product.getDefaultInstance()))
              .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("GetProduct"))
              .build();
        }
      }
    }
    return getGetProductMethod;
  }

  private static volatile io.grpc.MethodDescriptor<kh.edu.istad.common.grpc.product.v1.BatchGetProductsRequest,
      kh.edu.istad.common.grpc.product.v1.BatchGetProductsResponse> getBatchGetProductsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchGetProducts",
      requestType = kh.edu.istad.common.grpc.product.v1.BatchGetProductsRequest.class,
      responseType = kh.edu.istad.common.grpc.product.v1.BatchGetProductsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kh.edu.istad.common.grpc.product.v1.BatchGetProductsRequest,
      kh.edu.istad.common.grpc.product.v1.BatchGetProductsResponse> getBatchGetProductsMethod() {
    io.grpc.MethodDescriptor<kh.edu.istad.common.grpc.product.v1.BatchGetProductsRequest, kh.edu.istad.common.grpc.product.v1.BatchGetProductsResponse> getBatchGetProductsMethod;
    if ((getBatchGetProductsMethod = ProductServiceGrpc.getBatchGetProductsMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getBatchGetProductsMethod = ProductServiceGrpc.getBatchGetProductsMethod) == null) {
          ProductServiceGrpc.getBatchGetProductsMethod = getBatchGetProductsMethod =
              io.grpc.MethodDescriptor.<kh.edu.istad.common.grpc.product.v1.BatchGetProductsRequest, kh.edu.istad.common.grpc.product.v1.BatchGetProductsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BatchGetProducts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kh.edu.istad.common.grpc.product.v1.BatchGetProductsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kh.edu.istad.common.grpc.product.v1.BatchGetProductsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("BatchGetProducts"))
              .build();
        }
      }
    }
    return getBatchGetProductsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<kh.edu.istad.common.grpc.product.v1.ReserveStockRequest,
      kh.edu.istad.common.grpc.product.v1.ReserveStockResponse> getReserveStockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReserveStock",
      requestType = kh.edu.istad.common.grpc.product.v1.ReserveStockRequest.class,
      responseType = kh.edu.istad.common.grpc.product.v1.ReserveStockResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kh.edu.istad.common.grpc.product.v1.ReserveStockRequest,
      kh.edu.istad.common.grpc.product.v1.ReserveStockResponse> getReserveStockMethod() {
    io.grpc.MethodDescriptor<kh.edu.istad.common.grpc.product.v1.ReserveStockRequest, kh.edu.istad.common.grpc.product.v1.ReserveStockResponse> getReserveStockMethod;
    if ((getReserveStockMethod = ProductServiceGrpc.getReserveStockMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getReserveStockMethod = ProductServiceGrpc.getReserveStockMethod) == null) {
          ProductServiceGrpc.getReserveStockMethod = getReserveStockMethod =
              io.grpc.MethodDescriptor.<kh.edu.istad.common.grpc.product.v1.ReserveStockRequest, kh.edu.istad.common.grpc.product.v1.ReserveStockResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReserveStock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kh.edu.istad.common.grpc.product.v1.ReserveStockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kh.edu.istad.common.grpc.product.v1.ReserveStockResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("ReserveStock"))
              .build();
        }
      }
    }
    return getReserveStockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<kh.edu.istad.common.grpc.product.v1.ReleaseStockRequest,
      kh.edu.istad.common.grpc.product.v1.ReleaseStockResponse> getReleaseStockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReleaseStock",
      requestType = kh.edu.istad.common.grpc.product.v1.ReleaseStockRequest.class,
      responseType = kh.edu.istad.common.grpc.product.v1.ReleaseStockResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kh.edu.istad.common.grpc.product.v1.ReleaseStockRequest,
      kh.edu.istad.common.grpc.product.v1.ReleaseStockResponse> getReleaseStockMethod() {
    io.grpc.MethodDescriptor<kh.edu.istad.common.grpc.product.v1.ReleaseStockRequest, kh.edu.istad.common.grpc.product.v1.ReleaseStockResponse> getReleaseStockMethod;
    if ((getReleaseStockMethod = ProductServiceGrpc.getReleaseStockMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getReleaseStockMethod = ProductServiceGrpc.getReleaseStockMethod) == null) {
          ProductServiceGrpc.getReleaseStockMethod = getReleaseStockMethod =
              io.grpc.MethodDescriptor.<kh.edu.istad.common.grpc.product.v1.ReleaseStockRequest, kh.edu.istad.common.grpc.product.v1.ReleaseStockResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReleaseStock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kh.edu.istad.common.grpc.product.v1.ReleaseStockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kh.edu.istad.common.grpc.product.v1.ReleaseStockResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("ReleaseStock"))
              .build();
        }
      }
    }
    return getReleaseStockMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProductServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductServiceStub>() {
        @java.lang.Override
        public ProductServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductServiceStub(channel, callOptions);
        }
      };
    return ProductServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static ProductServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductServiceBlockingV2Stub>() {
        @java.lang.Override
        public ProductServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return ProductServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProductServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductServiceBlockingStub>() {
        @java.lang.Override
        public ProductServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductServiceBlockingStub(channel, callOptions);
        }
      };
    return ProductServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProductServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductServiceFutureStub>() {
        @java.lang.Override
        public ProductServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductServiceFutureStub(channel, callOptions);
        }
      };
    return ProductServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getProduct(kh.edu.istad.common.grpc.product.v1.GetProductRequest request,
        io.grpc.stub.StreamObserver<kh.edu.istad.common.grpc.product.v1.Product> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProductMethod(), responseObserver);
    }

    /**
     */
    default void batchGetProducts(kh.edu.istad.common.grpc.product.v1.BatchGetProductsRequest request,
        io.grpc.stub.StreamObserver<kh.edu.istad.common.grpc.product.v1.BatchGetProductsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBatchGetProductsMethod(), responseObserver);
    }

    /**
     * <pre>
     * idempotent by order_id
     * </pre>
     */
    default void reserveStock(kh.edu.istad.common.grpc.product.v1.ReserveStockRequest request,
        io.grpc.stub.StreamObserver<kh.edu.istad.common.grpc.product.v1.ReserveStockResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReserveStockMethod(), responseObserver);
    }

    /**
     * <pre>
     * compensation, idempotent
     * </pre>
     */
    default void releaseStock(kh.edu.istad.common.grpc.product.v1.ReleaseStockRequest request,
        io.grpc.stub.StreamObserver<kh.edu.istad.common.grpc.product.v1.ReleaseStockResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReleaseStockMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ProductService.
   */
  public static abstract class ProductServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ProductServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ProductService.
   */
  public static final class ProductServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ProductServiceStub> {
    private ProductServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductServiceStub(channel, callOptions);
    }

    /**
     */
    public void getProduct(kh.edu.istad.common.grpc.product.v1.GetProductRequest request,
        io.grpc.stub.StreamObserver<kh.edu.istad.common.grpc.product.v1.Product> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProductMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void batchGetProducts(kh.edu.istad.common.grpc.product.v1.BatchGetProductsRequest request,
        io.grpc.stub.StreamObserver<kh.edu.istad.common.grpc.product.v1.BatchGetProductsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBatchGetProductsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * idempotent by order_id
     * </pre>
     */
    public void reserveStock(kh.edu.istad.common.grpc.product.v1.ReserveStockRequest request,
        io.grpc.stub.StreamObserver<kh.edu.istad.common.grpc.product.v1.ReserveStockResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReserveStockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * compensation, idempotent
     * </pre>
     */
    public void releaseStock(kh.edu.istad.common.grpc.product.v1.ReleaseStockRequest request,
        io.grpc.stub.StreamObserver<kh.edu.istad.common.grpc.product.v1.ReleaseStockResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReleaseStockMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ProductService.
   */
  public static final class ProductServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<ProductServiceBlockingV2Stub> {
    private ProductServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     */
    public kh.edu.istad.common.grpc.product.v1.Product getProduct(kh.edu.istad.common.grpc.product.v1.GetProductRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetProductMethod(), getCallOptions(), request);
    }

    /**
     */
    public kh.edu.istad.common.grpc.product.v1.BatchGetProductsResponse batchGetProducts(kh.edu.istad.common.grpc.product.v1.BatchGetProductsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getBatchGetProductsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * idempotent by order_id
     * </pre>
     */
    public kh.edu.istad.common.grpc.product.v1.ReserveStockResponse reserveStock(kh.edu.istad.common.grpc.product.v1.ReserveStockRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getReserveStockMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * compensation, idempotent
     * </pre>
     */
    public kh.edu.istad.common.grpc.product.v1.ReleaseStockResponse releaseStock(kh.edu.istad.common.grpc.product.v1.ReleaseStockRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getReleaseStockMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service ProductService.
   */
  public static final class ProductServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ProductServiceBlockingStub> {
    private ProductServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public kh.edu.istad.common.grpc.product.v1.Product getProduct(kh.edu.istad.common.grpc.product.v1.GetProductRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProductMethod(), getCallOptions(), request);
    }

    /**
     */
    public kh.edu.istad.common.grpc.product.v1.BatchGetProductsResponse batchGetProducts(kh.edu.istad.common.grpc.product.v1.BatchGetProductsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBatchGetProductsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * idempotent by order_id
     * </pre>
     */
    public kh.edu.istad.common.grpc.product.v1.ReserveStockResponse reserveStock(kh.edu.istad.common.grpc.product.v1.ReserveStockRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReserveStockMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * compensation, idempotent
     * </pre>
     */
    public kh.edu.istad.common.grpc.product.v1.ReleaseStockResponse releaseStock(kh.edu.istad.common.grpc.product.v1.ReleaseStockRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReleaseStockMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ProductService.
   */
  public static final class ProductServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ProductServiceFutureStub> {
    private ProductServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<kh.edu.istad.common.grpc.product.v1.Product> getProduct(
        kh.edu.istad.common.grpc.product.v1.GetProductRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProductMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<kh.edu.istad.common.grpc.product.v1.BatchGetProductsResponse> batchGetProducts(
        kh.edu.istad.common.grpc.product.v1.BatchGetProductsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBatchGetProductsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * idempotent by order_id
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<kh.edu.istad.common.grpc.product.v1.ReserveStockResponse> reserveStock(
        kh.edu.istad.common.grpc.product.v1.ReserveStockRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReserveStockMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * compensation, idempotent
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<kh.edu.istad.common.grpc.product.v1.ReleaseStockResponse> releaseStock(
        kh.edu.istad.common.grpc.product.v1.ReleaseStockRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReleaseStockMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PRODUCT = 0;
  private static final int METHODID_BATCH_GET_PRODUCTS = 1;
  private static final int METHODID_RESERVE_STOCK = 2;
  private static final int METHODID_RELEASE_STOCK = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_PRODUCT:
          serviceImpl.getProduct((kh.edu.istad.common.grpc.product.v1.GetProductRequest) request,
              (io.grpc.stub.StreamObserver<kh.edu.istad.common.grpc.product.v1.Product>) responseObserver);
          break;
        case METHODID_BATCH_GET_PRODUCTS:
          serviceImpl.batchGetProducts((kh.edu.istad.common.grpc.product.v1.BatchGetProductsRequest) request,
              (io.grpc.stub.StreamObserver<kh.edu.istad.common.grpc.product.v1.BatchGetProductsResponse>) responseObserver);
          break;
        case METHODID_RESERVE_STOCK:
          serviceImpl.reserveStock((kh.edu.istad.common.grpc.product.v1.ReserveStockRequest) request,
              (io.grpc.stub.StreamObserver<kh.edu.istad.common.grpc.product.v1.ReserveStockResponse>) responseObserver);
          break;
        case METHODID_RELEASE_STOCK:
          serviceImpl.releaseStock((kh.edu.istad.common.grpc.product.v1.ReleaseStockRequest) request,
              (io.grpc.stub.StreamObserver<kh.edu.istad.common.grpc.product.v1.ReleaseStockResponse>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetProductMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              kh.edu.istad.common.grpc.product.v1.GetProductRequest,
              kh.edu.istad.common.grpc.product.v1.Product>(
                service, METHODID_GET_PRODUCT)))
        .addMethod(
          getBatchGetProductsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              kh.edu.istad.common.grpc.product.v1.BatchGetProductsRequest,
              kh.edu.istad.common.grpc.product.v1.BatchGetProductsResponse>(
                service, METHODID_BATCH_GET_PRODUCTS)))
        .addMethod(
          getReserveStockMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              kh.edu.istad.common.grpc.product.v1.ReserveStockRequest,
              kh.edu.istad.common.grpc.product.v1.ReserveStockResponse>(
                service, METHODID_RESERVE_STOCK)))
        .addMethod(
          getReleaseStockMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              kh.edu.istad.common.grpc.product.v1.ReleaseStockRequest,
              kh.edu.istad.common.grpc.product.v1.ReleaseStockResponse>(
                service, METHODID_RELEASE_STOCK)))
        .build();
  }

  private static abstract class ProductServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProductServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return kh.edu.istad.common.grpc.product.v1.ProductOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProductService");
    }
  }

  private static final class ProductServiceFileDescriptorSupplier
      extends ProductServiceBaseDescriptorSupplier {
    ProductServiceFileDescriptorSupplier() {}
  }

  private static final class ProductServiceMethodDescriptorSupplier
      extends ProductServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ProductServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ProductServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProductServiceFileDescriptorSupplier())
              .addMethod(getGetProductMethod())
              .addMethod(getBatchGetProductsMethod())
              .addMethod(getReserveStockMethod())
              .addMethod(getReleaseStockMethod())
              .build();
        }
      }
    }
    return result;
  }
}
