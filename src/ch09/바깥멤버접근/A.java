package ch09.바깥멤버접근;

public class A {
	//A의 인스턴스 필드와 메소드
	int field1;
	void method1() {}
	
	//A의 정적 필드와 메소드
	static int field2;
	static void method2() {}
	
	//인스턴스 멤버와 클래스
	class B {
		void method() {
			//A의 인스턴스 필드와 메소드 사용
			field1 = 10;
			method1();
			//A의 정적 필드와 메소드 사용
			field2 = 10;
			method2();
		}
	}
	
	//정적 멤버 클래스
	static class C {
		void method() {
			//field1 = 10; 컴파일에러난다. static 클래스는 static만 접근 가능
			//method1();
			field2 = 20;
			method2();
		}
	}
}
