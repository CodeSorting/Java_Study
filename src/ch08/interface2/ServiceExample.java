package ch08.interface2;

public class ServiceExample {
	public static void main(String[] args) {
		Service service = new ServiceImpl();
		
		service.defaultMethod1(); //private 메소드는 구현 객체 필요함.
		System.out.println();
		service.defaultMethod2();
		System.out.println();
		
		Service.staticMethod1(); //private static 메소드는 구현 객체 필요 없음.
		System.out.println();
		Service.staticMethod2();
		System.out.println();
	}
}
