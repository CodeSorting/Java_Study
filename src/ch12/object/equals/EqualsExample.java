package ch12.object.equals;

public class EqualsExample {
	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		if (obj1.equals(obj2)) { //매개변수 다형성
			System.out.println("obj1과 obj2는 동일합니다.");
		} else {
			System.out.println("obj1과 obj2는 다릅니다.");
		}
		if (obj1.equals(obj3)) { //매개변수 다형성
			System.out.println("obj1과 obj3는 동일합니다.");
		} else {
			System.out.println("obj1과 obj3는 다릅니다.");
		}
	}
}
