package ch19.TCP;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class EchoClient {
	public static void main(String[] args) {
		try {
			Socket socket = new Socket("localhost",50001);
			
			System.out.println("[클라이언트] 연결 성공");
			
			//데이터 보내기
			String sendMessage = "네트워크는 어려워.";
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
			dos.writeUTF(sendMessage);
			dos.flush();
			System.out.println("[클라이언트] 데이터 보냄 : " + sendMessage);
			
			//데이터 받기
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			String receiveMessage = dis.readUTF();
			System.out.println("[클라이언트] 데이터 받음 : " + receiveMessage);
		} catch (Exception e) {}
	}
}
