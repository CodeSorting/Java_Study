package ch14.Thread2.동기화.안전종료;

public class PrintThread extends Thread{
	public void run() {
		try {
			while (true) {
				System.out.println("실행 중");
				Thread.sleep(100);
			}
		} catch (InterruptedException e) {}
		System.out.println("리소스 정리");
		System.out.println("실행 종료");
	}
}
