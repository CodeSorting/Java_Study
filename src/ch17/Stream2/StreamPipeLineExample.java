package ch17.Stream2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.IntStream;

public class StreamPipeLineExample {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("홍길동", 10),
				new Student("신용권", 20),
				new Student("유미선", 30)
		);
		
		//방법 1
		Stream<Student> str = list.stream();
		IntStream score = str.mapToInt( student -> student.getScore() );
		//최종 처리
		double avg = score.average().getAsDouble();
		System.out.println("평균 : " + avg);
		
		//방법 2
		double avg2 = list.stream().mapToInt(student -> student.getScore()).average().getAsDouble();
		System.out.println("평균 : " + avg2);
	}
}
