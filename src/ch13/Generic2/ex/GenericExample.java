package ch13.Generic2.ex;

public class GenericExample {
	public static void main(String[] args) {
		Box<String> box1 = new Box<>();
		box1.content = "100";
		
		Box<String> box2 = new Box<>();
		box2.content = "100";
		
		boolean res = box1.compare(box2);
		System.out.println("res : " + res);
		
	}
}
