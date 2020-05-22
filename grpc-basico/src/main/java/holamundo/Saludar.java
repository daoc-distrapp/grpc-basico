package holamundo;

import holamundo.Holamundo.MsgRequest;
import holamundo.Holamundo.MsgResponse;
import io.grpc.stub.StreamObserver;

public class Saludar extends SaludarGrpc.SaludarImplBase {
	public void decirHola(MsgRequest request, StreamObserver<MsgResponse> response) {
		String name = request.getName();	
		MsgResponse msg = MsgResponse.
								newBuilder().
								setMessage("Hola " + name).
								build();
		response.onNext(msg);
		response.onCompleted();
		System.out.println("Petición en decirHola: " + name);
	}
	
	public void decirChao(MsgRequest request, StreamObserver<MsgResponse> response) {
		String name = request.getName();
		MsgResponse msg = MsgResponse.
								newBuilder().
								setMessage("Chao " + name).
								build();
		response.onNext(msg);
		response.onCompleted();
		System.out.println("Petición en decirChao: " + name);		
	}	
}