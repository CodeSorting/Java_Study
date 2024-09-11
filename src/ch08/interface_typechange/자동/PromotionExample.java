package ch08.interface_typechange.자동;

public class PromotionExample {
	public static void main(String[] args) {
		//인터페이스를 구현한 객체 b,c와 그 자손인 d와 e객체 선언
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a;
		a = b; //자동 타입 변환 -> 인터페이스 = 구현 객체
		a = c;
		a = d;
		a = e;
	}
}
