package ch06;

public class Korean {
	String nation = "대한민국";
	String name;
	String ssn;
	
	public Korean(String name, String ssn) { //생성자
		this.name = name;
		this.ssn = ssn;
	}
	
	Korean() {}
	
	Korean(String name){
		this.name = name;
	}
}
