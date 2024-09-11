package ch09.중첩클래스;

public class AExample {
	public static void main(String[] args) {
		//B 클래스의 객체 생성 및 인스턴스 필드,메소드 사용
		A.B b = new A.B();
		System.out.println(b.field1);
		b.method1();
		
		//B 클래스의 정적 필드랑 메소드는 객체 선언이 없어도 쓸 수 있다.
		System.out.println(A.B.field2);
		A.B.method2();
	}
}
