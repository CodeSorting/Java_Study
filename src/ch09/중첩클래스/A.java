package ch09.중첩클래스;

public class A { 
	//정적 멤버 클래스
	static class B{
		int field1 = 1;
		
		static int field2 = 2; //java17부터 클래스 B 내부에 static이 가능하다.
		
		//생성자
		B() {
			System.out.println("B 생성자 실행");
		}
		
		//인스턴스 메소드
		void method1() {
			System.out.println("B method1() 실행");
		}
		
		//정적 메소드
		static void method2() {
			System.out.println("B method2() 실행");
		}
	}
	
	
}
