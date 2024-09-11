package ch16.lambda4;

public class Person {
	public void ordering(Comparable comparable) {
		String a = "홍길동";
		String b = "김길동";
		
		int res = comparable.compare(a,b);
		
		if (res<0) {
			System.out.println(a + "은 " + b + "보다 앞에 옵니다.");
		} else if (res==0) {
			System.out.println(a + "은 " + b + "와 같습니다.");
		} else {
			System.out.println(a + "은 " + b + "보다 뒤에 옵니다.");
		}
	}
}
