package ch17.Stream4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
import java.util.function.Function;

public class 매핑 {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student("홍길동", 95));
		list.add(new Student("김길동", 90));
		list.add(new Student("최종빈", 85));
		
		//Student 스트림을 Score 스트림으로 변환 (mapToInt)
		list.stream().mapToInt( s -> s.getScore() ).forEach( score -> System.out.print(score + " "));
		System.out.println();
		
		int[] arr = {1,2,3,4,5};
		IntStream intstr = Arrays.stream(arr);
		intstr.asDoubleStream().forEach( s -> System.out.print(s + " "));
		System.out.println();
		
		intstr = Arrays.stream(arr);
		intstr.boxed().forEach( obj -> System.out.print( obj.intValue() + " ") );
		System.out.println();
		
		//apply 예시
        // Function 인터페이스를 구현한 람다 표현식
        Function<String, Integer> stringLengthFunction = str -> str.length();
        
        // apply 메서드 호출
        Integer length = stringLengthFunction.apply("Hello, World!");
        System.out.println("Length of the string: " + length);
	}
}
