package holamundo;

import java.io.IOException;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class HolaMundoServer {
	public final static int PORT = 50051;
	
	private Server server;

	public static void main(String[] args) {
		HolaMundoServer servidor = new HolaMundoServer();
		servidor.start();
		servidor.blockUntilShutdown();
	}

	private void start() {
		try {
			server = ServerBuilder.forPort(PORT).addService(new SaludarImpl()).build().start();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Servidor iniciado en el puerto: " + PORT);
		Runtime.getRuntime().addShutdownHook(new Thread() {
			@Override
			public void run() {
				System.err.println("*** shutting down gRPC server since JVM is shutting down");
				HolaMundoServer.this.stop();
				System.err.println("*** server shut down");
			}
		});
	}

	private void blockUntilShutdown() {
		if (server != null) {
			try {
				server.awaitTermination();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private void stop() {
		if (server != null) {
			server.shutdown();
		}
	}

	// Aquí se reciben las llamadas y se responde
	private class SaludarImpl extends SaludarGrpc.SaludarImplBase {
		public void decirHola(HolaRequest req, StreamObserver<HolaReply> responseObserver) {
			HolaReply reply = HolaReply.newBuilder().setMessage("Hola " + req.getName()).build();
			responseObserver.onNext(reply);
			responseObserver.onCompleted();
		}
	}

}
