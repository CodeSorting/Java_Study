package ch08.interface_inheritance;

public class InterfaceCImpl implements InterfaceC{
	//A와 B의 상속을 받은 인터페이스 C를 구현한 객체
	public void methodA() {
		System.out.println("InterfaceCImpl-methodA() 실행");
	}
	
	public void methodB() {
		System.out.println("InterfaceCImpl-methodB() 실행");
	}
	
	public void methodC() {
		System.out.println("InterfaceCImpl-methodC() 실행");
	}
}
