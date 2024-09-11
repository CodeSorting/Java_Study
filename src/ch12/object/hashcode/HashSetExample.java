package ch12.object.hashcode;

import java.util.HashSet;

public class HashSetExample {
	public static void main(String[] args) {
		HashSet hashset = new HashSet();
		
		Student s1 = new Student(1, "홍길동");
		hashset.add(s1);
		System.out.println("저장된 객체 수 : " + hashset.size());
		
		Student s2 = new Student(1, "홍길동");
		hashset.add(s2);
		System.out.println("저장된 객체 수 : " + hashset.size());
		
		Student s3 = new Student(2, "홍길동");
		hashset.add(s3);
		System.out.println("저장된 객체 수 : " + hashset.size());
		//hashCode()의 @Override를 없애면 s1,s2,s3의 객체가 다 다르므로 1 2 3으로 출력된다.
	}
}
