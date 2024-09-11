package ch08.interface다형성.매개변수;

public class Taxi implements Vehicle{
	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
	}
}
