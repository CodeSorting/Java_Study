package ch06;

public class 싱글톤 {
	private static 싱글톤 singleton = new 싱글톤(); // 생성자는 한번만 생성되므로 new를 해도 
	// singleton 인스턴스에서 singleton 변수는 한번만 생성된다. (재귀가 안일어남.)
	
	private 싱글톤() {}
	
	public static 싱글톤 getInstance() {
		return singleton;
	}
}
