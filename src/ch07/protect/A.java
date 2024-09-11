package ch07.protect;

public class A { //protected는 같은 패키지(객체 생성 가능)이거나 상속받아야 사용 가능(상속은 객체 만들기는 안됨.)
	protected String field;
	protected A() {
		
	}
	protected void method() {
		
	}
}
