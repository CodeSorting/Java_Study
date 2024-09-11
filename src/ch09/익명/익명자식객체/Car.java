package ch09.익명.익명자식객체;

public class Car {
	private Tire tire1 = new Tire();
	private Tire tire2 = new Tire() { //필드에 익명 자식 객체 대입
		@Override
		public void roll() {
			System.out.println("익명 자식 Tire 객체 1이 굴러갑니다.");
		}
	};
	
	//메소드(필드 이용)
	public void run1() {
		tire1.roll();
		tire2.roll();
	}
	
	//메소드(로컬 변수 이용)
	public void run2() {
		Tire tire = new Tire() { //로컬 변수에 익명 자식 객체 대입
			@Override
			public void roll() {
				System.out.println("익명 자식 Tire 객체 2이 굴러갑니다.");
			}
		};
		tire.roll();
	}
	
	//메소드(매개변수 이용)
	public void run3(Tire tire) {
		tire.roll();
	}
}
