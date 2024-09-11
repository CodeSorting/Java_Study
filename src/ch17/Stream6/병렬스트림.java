package ch17.Stream6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class 병렬스트림 {
	public static void main(String[] args) {
		Random random = new Random();
		List<Integer> scores = new ArrayList<>();
		for (int i=0;i<10000000;++i) {
			scores.add(random.nextInt(101));
		}
		
		double avg = 0.0;
		long starttime = 0;
		long endtime = 0;
		long time = 0;
		
		Stream<Integer> stream = scores.stream();
		starttime = System.nanoTime();
		avg = stream.mapToInt(i -> i.intValue()).average().getAsDouble();
		endtime = System.nanoTime();
		time = endtime - starttime;
		System.out.println("평균: " + avg + ", 일반 스트림 처리 시간: " + time);
		
		Stream<Integer> parallelStream = scores.parallelStream();
		starttime = System.nanoTime();
		avg = parallelStream.mapToInt(i -> i.intValue()).average().getAsDouble();
		endtime = System.nanoTime();
		time = endtime - starttime;
		System.out.println("평균: " + avg + ", 일반 스트림 처리 시간: " + time);
		//천만개 : 1.3배 차이, 일억개 : 3배차이
	}
}
