package ch07.protect;

public class B { //같은 패키지 : 객체 만들기 가능
	public void method() {
		A a = new A();
		a.field = "value";
		a.method();
	}
}
