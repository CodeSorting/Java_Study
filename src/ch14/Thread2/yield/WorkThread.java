package ch14.Thread2.yield;

public class WorkThread extends Thread{
	public boolean work = true;
	public WorkThread(String name) {
		setName(name); //스레드 메소드 중 하나인데 자식 클래스라 사용 가능
	}
	
	@Override
	public void run() {
		while (true) {
			if (work) {
				System.out.println(getName() + ": 작업처리");
			} else {
				Thread.yield();
			}
		}
	}
}
