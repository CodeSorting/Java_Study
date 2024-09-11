package ch11.예외처리2;

public class MyResource implements AutoCloseable{
	private String name;
	
	public MyResource(String name) { //생성자
		this.name = name;
	}
	
	public String read1() { //메소드1
		System.out.println("[MyResource("+name+") 열기");
		return "100";
	}
	
	public String read2() { //메소드2
		System.out.println("[MyResource("+name+") 열기");
		return "abc";
	}
	
	@Override // AutoCloseable 인터페이스는 자원을 다 쓰면 자동으로 닫게 해주는 인터페이스이다. close()를 반드시 재정의해야한다.
	public void close() throws Exception {
		System.out.println("[MyResource("+name+") 닫기");
	}
}
