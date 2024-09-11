package ch06;

public class Car2Example {
	public static void main(String[] args) {
		Car2 myCar = new Car2();
		
		myCar.setGas(3); // Car의 setGas() 메소드 호출;
		
		boolean gasState = myCar.isLeftGas();  // Car의 isLeftGas() 메소드 호출
		if(gasState) {
			System.out.println("출발 합니다.");
			myCar.run(); // Car의 run() 메소드 호출
		}
		
		if(myCar.isLeftGas()) {
			System.out.println("gas를 주입할 필요가 없습니다.");
		} else {
			System.out.println("gas를 주입하세요.");
		}
	}
}
