package holamundo;

import java.util.concurrent.TimeUnit;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class HolaMundoClient {
	public static final String USER_NAME = "Diego";
	public static final String HOST = "localhost";
	public static final int PORT = 50051;
	
	private final ManagedChannel channel;
	private final SaludarGrpc.SaludarBlockingStub blockingStub;

	public HolaMundoClient(String host, int port) {
		channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
		blockingStub = SaludarGrpc.newBlockingStub(channel);
	}

	public static void main(String[] args) {
		HolaMundoClient client = new HolaMundoClient(HOST, PORT);
		try {
			client.saluda(USER_NAME);
		} finally {
			client.shutdown();
		}
	}

	public void saluda(String name) {
		try {
			System.out.println("Intenta saludar...");
			HolaRequest request = HolaRequest.newBuilder().setName(name).build();
			HolaReply response = blockingStub.decirHola(request);
			System.out.println("Respuesta: " + response.getMessage());
		} catch (RuntimeException e) {
			System.out.println("RPC falló: " + e);
		}
	}

	public void shutdown() {
		try {
			channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
