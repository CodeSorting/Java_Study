package ch17.Stream6;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExample {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student("최종빈","남", 92));
		list.add(new Student("에르핀","여", 87));
		list.add(new Student("김동휘","남", 95));
		list.add(new Student("세라","여", 93));
		list.add(new Student("김동건","남", 90));
		
		//필터링한 요소 리스트로 수집 toList()
		List<Student> maleList = list.stream().filter(n -> n.getSex().equals("남")).toList();
		
		maleList.stream().forEach(s -> System.out.println(s.getName()));
		
		//collect(Collectors.toMap())으로 요소들 부분을 모아서 맵 만들기
		Map<String,Integer> map = list.stream().collect(
			Collectors.toMap(
				s -> s.getName(), s -> s.getScore()
				)
			);
		System.out.println(map);
		System.out.println();
		
		//list를 그룹화해서 <남과여, student>로 모은다. 남여:키,student=값으로함.
		Map<String, List<Student>> map2 = list.stream().collect(Collectors.groupingBy(s->s.getSex()));
		
		List<Student> maleList2 = map2.get("남"); //map의 남(키)에 대한 값(리스트) 얻기
		maleList2.stream().forEach(s -> System.out.println(s.getName()));
		System.out.println();
		
		List<Student> femaleList = map2.get("여"); //map의 여(키)에 대한 값(리스트) 얻기
		femaleList.stream().forEach(s -> System.out.println(s.getName()));
	}
}
