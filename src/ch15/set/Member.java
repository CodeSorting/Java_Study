package ch15.set;

public class Member {
	public String name;
	public int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int hashCode() {
		return age + name.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member member) {
			return member.name.equals(name) && (member.age==age);
		} else {
			return false;
		}
	}
}
