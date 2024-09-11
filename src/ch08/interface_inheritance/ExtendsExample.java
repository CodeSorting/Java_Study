package ch08.interface_inheritance;

public class ExtendsExample {
	public static void main(String[] args) {
		//A,B의 상속을 받은 인터페이스 C를 구현한 객체 선언..이게 무슨 개족보...
		InterfaceCImpl impl = new InterfaceCImpl();
		
		InterfaceA ia = impl;
		ia.methodA();
		//ia.methodB(); 안됨.
		System.out.println();
		
		InterfaceB ib = impl;
		ib.methodB();
		//ia.methodA(); 안됨.
		System.out.println();
		
		InterfaceC ic = impl; //상속받은 인터페이스 C라 모두 됨.
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}
}
