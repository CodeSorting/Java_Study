package ch08.interface_typechange.강제;

public class CastingExample {
	public static void main(String[] args) {
		//인터페이스 선언과 구현 객체 대입
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		//vehicle.checkFare(); 안됨.
		
		//강제타입 변환 후 호출
		Bus bus = (Bus) vehicle;
		bus.run();
		bus.checkFare();
	}
}
