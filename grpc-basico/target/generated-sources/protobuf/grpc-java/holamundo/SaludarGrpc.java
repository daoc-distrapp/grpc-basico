package holamundo;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * Definición de los métodos.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.29.0)",
    comments = "Source: holamundo.proto")
public final class SaludarGrpc {

  private SaludarGrpc() {}

  public static final String SERVICE_NAME = "holamundo.Saludar";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<holamundo.HolaRequest,
      holamundo.HolaReply> getDecirHolaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DecirHola",
      requestType = holamundo.HolaRequest.class,
      responseType = holamundo.HolaReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<holamundo.HolaRequest,
      holamundo.HolaReply> getDecirHolaMethod() {
    io.grpc.MethodDescriptor<holamundo.HolaRequest, holamundo.HolaReply> getDecirHolaMethod;
    if ((getDecirHolaMethod = SaludarGrpc.getDecirHolaMethod) == null) {
      synchronized (SaludarGrpc.class) {
        if ((getDecirHolaMethod = SaludarGrpc.getDecirHolaMethod) == null) {
          SaludarGrpc.getDecirHolaMethod = getDecirHolaMethod =
              io.grpc.MethodDescriptor.<holamundo.HolaRequest, holamundo.HolaReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DecirHola"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  holamundo.HolaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  holamundo.HolaReply.getDefaultInstance()))
              .setSchemaDescriptor(new SaludarMethodDescriptorSupplier("DecirHola"))
              .build();
        }
      }
    }
    return getDecirHolaMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SaludarStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SaludarStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SaludarStub>() {
        @java.lang.Override
        public SaludarStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SaludarStub(channel, callOptions);
        }
      };
    return SaludarStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SaludarBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SaludarBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SaludarBlockingStub>() {
        @java.lang.Override
        public SaludarBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SaludarBlockingStub(channel, callOptions);
        }
      };
    return SaludarBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SaludarFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SaludarFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SaludarFutureStub>() {
        @java.lang.Override
        public SaludarFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SaludarFutureStub(channel, callOptions);
        }
      };
    return SaludarFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Definición de los métodos.
   * </pre>
   */
  public static abstract class SaludarImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Envía un saludo
     * </pre>
     */
    public void decirHola(holamundo.HolaRequest request,
        io.grpc.stub.StreamObserver<holamundo.HolaReply> responseObserver) {
      asyncUnimplementedUnaryCall(getDecirHolaMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getDecirHolaMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                holamundo.HolaRequest,
                holamundo.HolaReply>(
                  this, METHODID_DECIR_HOLA)))
          .build();
    }
  }

  /**
   * <pre>
   * Definición de los métodos.
   * </pre>
   */
  public static final class SaludarStub extends io.grpc.stub.AbstractAsyncStub<SaludarStub> {
    private SaludarStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SaludarStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SaludarStub(channel, callOptions);
    }

    /**
     * <pre>
     * Envía un saludo
     * </pre>
     */
    public void decirHola(holamundo.HolaRequest request,
        io.grpc.stub.StreamObserver<holamundo.HolaReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDecirHolaMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Definición de los métodos.
   * </pre>
   */
  public static final class SaludarBlockingStub extends io.grpc.stub.AbstractBlockingStub<SaludarBlockingStub> {
    private SaludarBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SaludarBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SaludarBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Envía un saludo
     * </pre>
     */
    public holamundo.HolaReply decirHola(holamundo.HolaRequest request) {
      return blockingUnaryCall(
          getChannel(), getDecirHolaMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Definición de los métodos.
   * </pre>
   */
  public static final class SaludarFutureStub extends io.grpc.stub.AbstractFutureStub<SaludarFutureStub> {
    private SaludarFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SaludarFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SaludarFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Envía un saludo
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<holamundo.HolaReply> decirHola(
        holamundo.HolaRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDecirHolaMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DECIR_HOLA = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SaludarImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SaludarImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DECIR_HOLA:
          serviceImpl.decirHola((holamundo.HolaRequest) request,
              (io.grpc.stub.StreamObserver<holamundo.HolaReply>) responseObserver);
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

  private static abstract class SaludarBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SaludarBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return holamundo.HolaMundoProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Saludar");
    }
  }

  private static final class SaludarFileDescriptorSupplier
      extends SaludarBaseDescriptorSupplier {
    SaludarFileDescriptorSupplier() {}
  }

  private static final class SaludarMethodDescriptorSupplier
      extends SaludarBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SaludarMethodDescriptorSupplier(String methodName) {
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
      synchronized (SaludarGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SaludarFileDescriptorSupplier())
              .addMethod(getDecirHolaMethod())
              .build();
        }
      }
    }
    return result;
  }
}
