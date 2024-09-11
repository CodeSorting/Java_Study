package ch17.Stream6;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExample2 {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student("최종빈","남", 92));
		list.add(new Student("에르핀","여", 87));
		list.add(new Student("김동휘","남", 95));
		list.add(new Student("세라","여", 93));
		list.add(new Student("김동건","남", 90));
		
		//collect안에 Collectors.averagingDouble로 double 값을 얻는다.
		//Collectors.() 이 안에 mapping,counting,maxBy,minBy,reducing도 들어갈 수 있음.
		Map<String, Double> map = list.stream().collect(
				Collectors.groupingBy(s -> s.getSex(),Collectors.averagingDouble(s->s.getScore())));
		
		System.out.println(map);
	}
}
