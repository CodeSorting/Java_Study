package ch17.Stream5;

import java.util.ArrayList;
import java.util.List;

public class 요소기본집계_reduce {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student("홍길동", 92));
		list.add(new Student("김길동", 95));
		list.add(new Student("신용권", 88));
		
		int sum1 = list.stream().mapToInt(Student :: getScore).sum();
		
		int sum2 = list.stream().map(Student :: getScore).reduce(0, (a,b) -> (a+b));
		
		System.out.println("sum1: " + sum1);
		System.out.println("sum2: " + sum2);
	}
}
