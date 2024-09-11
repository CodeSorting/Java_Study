package ch15.set;

import java.util.*;
public class HashSetExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("Java");
		set.add("나");
		set.add("Spring");
		
		int size = set.size();
		System.out.println("총 객체 수 : " + size);
		
		Set<Member> set2 = new HashSet<Member>();
		set2.add(new Member("홍길동",30));
		set2.add(new Member("홍길동",30));
		set2.add(new Member("홍길동",50));
		set2.add(new Member("최종빈",30));
		
		size = set2.size();
		System.out.println("총 객체 수 : " + size);
		
		Iterator<Member> iterator = set2.iterator();
		while (iterator.hasNext()) {
			Member element = iterator.next();
			System.out.println(element.name + " " + element.age);
			if (element.name.equals("최종빈")) {
				//가져온 객체를 컬랙션에서 제거
				iterator.remove();
			}
		}
		
		set2.remove(new Member("홍길동",50));
		System.out.println("남은 값 : " + set2.size());
	}
}
