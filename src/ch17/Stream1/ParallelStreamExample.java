package ch17.Stream1;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;

public class ParallelStreamExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		
		Stream<String> str = list.parallelStream();
		str.forEach( name -> System.out.println(name + ": " + Thread.currentThread().getName()));
	}
}