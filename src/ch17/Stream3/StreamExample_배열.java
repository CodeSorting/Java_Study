package ch17.Stream3;

import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.IntStream;

public class StreamExample_배열 {
	public static void main(String[] args) {
		String[] arr = {"홍길동", "신용권", "김미나"};
		Stream<String> str = Arrays.stream(arr); //stream()에서 배열을 스트림으로 변경할 때 Arrays.로 참조해야함
		str.forEach( item -> System.out.print(item + " "));
		System.out.println();
		
		int[] arrays = {1,2,3,4,5};
		IntStream intStream = Arrays.stream(arrays);
		intStream.forEach( item -> System.out.print(item + " ") );
		
	}
}
