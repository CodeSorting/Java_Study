package ch17.Stream1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.stream.Stream;
import java.util.Set;

public class StreamExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		set.add("홍길동");
		set.add("김길동");
		set.add("박길동");
		set.add("조길동");
		
		Stream<String> str = set.stream();
		str.forEach( name -> System.out.println(name));
	}
}
