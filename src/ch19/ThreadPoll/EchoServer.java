package ch19.ThreadPoll;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EchoServer {
	private static ServerSocket serverSocket = null;
	//스레드폴에서 스레드 10개로 제한하는 큐 생성
	private static ExecutorService executorService = Executors.newFixedThreadPool(10);
	
	public static void main(String[] args) {
		System.out.println("-------------------------------------------");
		System.out.println("서버를 종료하려면 q 또는 Q를 입력하고 Enter를 누르시오.");
		System.out.println("-------------------------------------------");
		
		//TCP 서버 시작
		startServer();
				
		//키보드 입력
		Scanner in = new Scanner(System.in);
		while (true) {
			String key = in.nextLine();
			if (key.toLowerCase().equals("q")) break;
		}
		in.close();
						
		//TCP 서버 종료
		stopServer();
	}
	
	public static void startServer() {
		Thread thread = new Thread() {
			@Override
			public void run() {
				try {
					//serversocket 생성 및 port 바인딩
					serverSocket = new ServerSocket(50001);
					System.out.println("[서버] 시작됨.");
					
					while (true) {
						System.out.println("\n[서버] 연결 요청을 기다림\n");
						//연결 수락
						Socket socket = serverSocket.accept();
						//스레드폴에서 10개씩 스레드 실행
						executorService.execute(() -> {
							try {
								//연결된 클라이언트 정보 얻기
								InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
								System.out.println("[서버] " + isa.getHostName() + "의 연결 요청을 수락함.");
								
								//데이터 받기
								DataInputStream dis = new DataInputStream(socket.getInputStream());
								String message = dis.readUTF();
								
								//데이터 보내기
								DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
								dos.writeUTF(message);
								dos.flush();
								System.out.println("[서버] 받은 데이터를 다시 보냄 : " + message);
								
								//연결 끊기
								socket.close();
								System.out.println("[서버] " + isa.getHostString() + "의 연결 요청을 끊음.");
							} catch (IOException e) {
								System.out.println("[서버] " + e.getMessage());
							}
						});
					}
				} catch(IOException e) {
					System.out.println("[서버] " + e.getMessage());
				}
			}
		};
		//스레드 시작
		thread.start();
	}
	
    public static void stopServer() {
		try {
			serverSocket.close();
			executorService.shutdownNow(); //스레드폴 종료
			System.out.println("[서버] 종료됨.");
		} catch(IOException e) {}
	}
}