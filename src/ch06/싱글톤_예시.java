package ch06;

public class 싱글톤_예시 {
	public static void main(String[] args) {
		싱글톤 obj1 = 싱글톤.getInstance();
		싱글톤 obj2 = 싱글톤.getInstance();
		
		// 동일한 객체를 참조하는지 확인
		if (obj1==obj2) {
			System.out.println("같은 곳을 가리킴");
		}
		else {
			System.out.println("다른 곳을 가리킴");
		}
	}
}
