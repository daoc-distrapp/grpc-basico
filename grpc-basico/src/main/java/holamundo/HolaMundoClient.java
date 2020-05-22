package holamundo;

import holamundo.Holamundo.MsgRequest;
import holamundo.Holamundo.MsgResponse;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class HolaMundoClient {
	public static final String HOST = "localhost";
	public static final int PORT = 8080;

	public static void main(String[] args) {
		ManagedChannel channel = ManagedChannelBuilder.
									forAddress(HOST, PORT).
									usePlaintext().
									build();
		SaludarGrpc.SaludarBlockingStub blockingStub = SaludarGrpc.newBlockingStub(channel);	
		
		System.out.println("Intenta saludar...");
		
		String name = "perro";
		MsgRequest request = MsgRequest.newBuilder().setName(name).build();
		MsgResponse response = blockingStub.decirHola(request);
		System.out.println("Respuesta al Hola: " + response.getMessage());		
		
		name = "gato";
		request = MsgRequest.newBuilder().setName(name).build();
		response = blockingStub.decirChao(request);
		System.out.println("Respuesta al Chao: " + response.getMessage());	
		
		channel.shutdown();
	}

}
