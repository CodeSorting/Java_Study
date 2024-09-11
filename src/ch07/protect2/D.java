package ch07.protect2;

import ch07.protect.A; //import는 해야함.

public class D extends A{ //다른 패키지, 상속
	public D() {
		super(); //A 생성자 호출
	}
	
	public void method1() {
		this.field = "value";
		this.method();
	}
	
	public void method2() { //객체를 직접적으로 생성해서 사용해서는 안된다.
		//A a = new A();
		//a.field = "value";
		//a.method();
	}
}
