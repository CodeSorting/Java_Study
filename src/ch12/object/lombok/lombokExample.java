package ch12.object.lombok;

public class lombokExample {
	public static void main(String[] args) {
		Member m = new Member("1-1","최종빈",22);
		
		m.setAge(23);
		m.setId("1-2");
		m.setName("최종빈2");
		
		System.out.println(m.getAge());
		System.out.println(m.getName());
		System.out.println(m.getId());
	}
}
