package ch12.Reflection;

public class GetClassExample {
	public static void main(String[] args) throws Exception{
		// 클래스 호출하는법 3가지
		Class clazz = Car.class;
		
		Class clazz2 = Class.forName("ch12.Reflection.Car");
		
		Car car = new Car();
		Class clazz3 = car.getClass();
		
		System.out.println("패키지 : " + clazz.getPackage());
		System.out.println("패키지 : " + clazz.getSimpleName());
		System.out.println("패키지 : " + clazz.getName());
	}
}
