package ch14.Thread1;

import java.awt.Toolkit;

public class BeepPrintExample {
	public static void main(String[] args) {
		//Thread 클래스로 Runnable 인터페이스의 구현 객체를 매개값으로 값는 생성자를 호출하면 된다.
		 /* class Task implements Runnable{
		  *     @Override
		  *     public void run(){}
		  * } 
		 * Runnable task = new Task();
		 * Thread thread = new Thread(task);
		 */
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for (int i=0;i<5;++i) {
					toolkit.beep();
					try { Thread.sleep(1000); } catch(Exception e) {}
				}
			}
		});
		
		thread.start();
		for (int i=0;i<5;++i) {
			System.out.println("띵");
			try { Thread.sleep(1000); } catch(Exception e) {}
		}
		
	}
}
