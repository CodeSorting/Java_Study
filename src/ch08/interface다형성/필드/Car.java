package ch08.interface다형성.필드;

public class Car {
	Tire tire1 = new HankookTire(); //필드 다형성
	Tire tire2 = new HankookTire();
	
	void run() {
		tire1.roll();
		tire2.roll();
	}
}
