package ch17.Stream4;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class FlatExample {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		list1.add("this is java");
		list1.add("this is c++");
		list1.add("this is python");
		//list 한 개의 요소를 복수 개의 요소들로 변환하고 새로운 스트림을 리턴한다.
		list1.stream().flatMap(data -> Arrays.stream(data.split(" ")))
		    .forEach(word -> System.out.print(word + ","));
		System.out.println();
		
		List<String> list2 = Arrays.asList("10, 20, 30", "40, 50"); // 배열 -> list
		list2.stream().flatMapToInt(data -> { //T -> IntStream
			String[] strArr = data.split(",");
			int[] intArr = new int[strArr.length];
			for (int i=0;i<strArr.length;++i) {
				intArr[i] = Integer.parseInt(strArr[i].trim());
			}
			return Arrays.stream(intArr); //int 배열 -> IntStream
		}).forEach(number -> System.out.print(number + ","));
	}
}
