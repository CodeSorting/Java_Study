package ch13.Generic4;

public class GenericExample {
	public static <T extends Number> boolean compare(T t1,T t2) {
		System.out.println("compare(" + t1.getClass().getSimpleName() + ", " +
	t2.getClass().getSimpleName() + ")");
		
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		
		return (v1==v2);
	}
	
	public static void main(String[] args) {
		boolean res1 = compare(10,20);
		System.out.println(res1);
		
		boolean res2 = compare(1.23456789,1.23456789);
		System.out.println(res2);
	}
}
