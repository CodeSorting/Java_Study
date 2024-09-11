package ch12.object.hashcode;

public class Student {
	private int no;
    private String name;
	
	public Student(int no, String name) {
		this.no = no;
		this.name = name;
	}
	
	public int getNo() {
		return no;
	}
	public String getName() {
		return name;
	}
	
	@Override
	public int hashCode() { //기본 해시코드 = 객체마다 다른 위치값을 반환한다.
		int hashCode = no + name.hashCode();
		return hashCode;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student target) {
			if (no == target.getNo() && name.equals(target.getName())) {
				return true;
			}
		}
		return false;
	}
	
}
