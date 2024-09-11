package ch19.TCP;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientExample {
	public static void main(String[] args) {
		//ServerExaple을 먼저 실행하고 ClientExample을 실행하면 내 ip의 연결 요청을 수락한다.
		//루프백 주소인 127.0.0.1을 수락하고 끊음.
		try {
			Socket socket = new Socket("localhost",50001);
			
			System.out.println("[클라이언트] 연결 성공");
			
			socket.close();
			System.out.println("[클라이언트] 연결 끊음");
		} catch (UnknownHostException e) {
			//ip 표기 방법이 잘못되었을 경우
		} catch (IOException e) {
			//해당 포트의 서버에 연결할 수 없는 경우
		}
	}
}
