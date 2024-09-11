package ch06;

public class KoreaExample {
	public static void main(String args[]) {
		Korean jongbin = new Korean("Choi Jong Bin","030329-3xxxxxx");
		System.out.println("Korean 클래스의 jongbin 인스턴스");
		System.out.println("국가 : " + jongbin.nation);
		System.out.println("이름 : " + jongbin.name);
		System.out.println("ssn : " + jongbin.ssn);
	}
}
