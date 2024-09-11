package ch17.Stream5;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class SortingExample {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student("홍길동", 30));
		list.add(new Student("최종빈", 10));
		list.add(new Student("김길동", 20));
		
		list.stream().sorted().forEach( s -> System.out.println(s.getName() + ": " + s.getScore()) );
		System.out.println();
		
		list.stream().sorted(Comparator.reverseOrder())
		.forEach( s -> System.out.println(s.getName() + ": " + s.getScore()) );
		
		
		
	}
}
