package ch07.instance_of;

public class InstanceofExample {
	public static void personInfo(Person person) {
		System.out.println("name : " + person.name);
		person.walk();
		
		/*
		 * person instance of Student student
		 * == person instance of Student,
		 * Student student = (Student) Person;
		 */
		
		if (person instanceof Student student) {
			System.out.println("studentNo : " + student.studentNo);
			student.study();
		}
	}
	
	public static void main(String[] args) {
		Person p1 = new Person("홍길동");
		personInfo(p1);
		
		System.out.println();
		
		Person p2 = new Student("김길동",10); //p2는 Student로 자동변환 되어서
		//person instance of student를 만족한다. (동일한 곳을 가리킴.)
		personInfo(p2);
	}
}
