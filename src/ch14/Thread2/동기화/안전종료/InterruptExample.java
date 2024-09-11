package ch14.Thread2.동기화.안전종료;

public class InterruptExample {
	public static void main(String[] args) {
		Thread thread = new PrintThread();
		thread.start();
		
		try {
			thread.sleep(1000);
		} catch (InterruptedException e) {}
		
		thread.interrupt();
	}
}
