package ch17.Stream5;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble; // isPresent,orElse,ifPresent : 원소가 없을 때 해결방법

public class OptionalExample {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(5);
		list.add(4);
		/* 예외 발생
		 double avg = list.stream().mapToInt(Integer :: intValue).average().getAsDouble();
		*/
		//방법 1
		OptionalDouble optional = list.stream()
				.mapToInt(Integer :: intValue).average();
		if (optional.isPresent()) {
			System.out.println("방법 1 평균: " + optional.getAsDouble());
		} else {
			System.out.println("방법 1 평균: 0.0");
		}
		
		//방법 2
		double avg = list.stream()
				.mapToInt(Integer :: intValue).average().orElse(0.0);
		System.out.println("방법 2 평균: " + avg);
		
		//방법 3
		list.stream().mapToInt(Integer :: intValue).average().ifPresent(a->System.out.println("방법 3 평균: " + a));
	}
}
