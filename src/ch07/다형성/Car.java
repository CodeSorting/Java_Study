package ch07.다형성;

public class Car {
	
	public Tire tire;
	
	public void run() {
		tire.roll(); //tire 필드에 대입된 객체의 roll() 메소드 호출
	}
}
