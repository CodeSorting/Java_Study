package ch09;

public class A {
	public void method1(int arg) {
		int var = 1;
		
		class B {
			void method2() { //로컬 변수를 로컬 클래스 안에서 사용할 경우 final특성을 지니게 된다. 로컬 클래스 B
				//안에서 arg,var값을 못변하게 하려는 의도이다.
				System.out.println("arg:" + arg);
				System.out.println("var:" + var);
			}
		}
		
		B b = new B();
		b.method2();
	}
}
