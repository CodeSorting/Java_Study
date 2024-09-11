package ch17.Stream5;

import java.util.ArrayList;
import java.util.List;

public class SortingExample2 {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student("홍길동", 30));
		list.add(new Student("최종빈", 10));
		list.add(new Student("김길동", 20));
		list.add(new Student("박길동", 40));
		//score를 기준으로 오름차순 정렬
		list.stream().sorted( (s1,s2) -> Integer.compare(s1.getScore(),s2.getScore()) )
		.forEach(s -> System.out.println(s.getName() + ": " + s.getScore()));
		System.out.println();
		
		list.stream().sorted( (s1,s2) -> Integer.compare(s2.getScore(),s1.getScore()) )
		.forEach(s -> System.out.println(s.getName() + ": " + s.getScore()));
		
		
	}
}
