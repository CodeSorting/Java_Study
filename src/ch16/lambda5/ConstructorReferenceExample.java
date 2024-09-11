package ch16.lambda5;

public class ConstructorReferenceExample {
	public static void main(String[] args) {
		Person person = new Person();
		
		Member m1 = person.getMember1( Member :: new );
		System.out.println(m1); //toString 재정의함.

		Member m2 = person.getMember2( Member :: new );
		System.out.println(m2);
	}
}
