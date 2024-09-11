package ch07.다형성;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		//tire 객체 장착
		myCar.tire = new Tire();
		myCar.run();
		
		//한국타이어 객체 장착
		myCar.tire = new HanKookTire();
		myCar.run();
		
		//금호타이어 객체 장착
		myCar.tire = new KumhoTire();
		myCar.run();
	}
}
