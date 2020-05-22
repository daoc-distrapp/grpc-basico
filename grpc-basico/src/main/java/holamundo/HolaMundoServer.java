package holamundo;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class HolaMundoServer {
	public final static int PORT = 8080;
	
	public static void main(String[] args) {
		try {
			Server server = ServerBuilder.
								forPort(PORT).
								addService(new Saludar()).
								build().
								start();
			System.out.println("Servidor iniciado en el puerto: " + PORT);
			server.awaitTermination();
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
}
