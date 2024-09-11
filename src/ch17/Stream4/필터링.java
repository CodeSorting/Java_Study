package ch17.Stream4;

import java.util.ArrayList;
import java.util.List;

public class 필터링 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("홍길동"); list.add("김민철"); list.add("최종빈"); list.add("김길동");
		list.add("홍길동"); list.add("김민철");
		
		//중복 제거
		list.stream().distinct().forEach( n -> System.out.print(n + " ") );
		System.out.println();
		
		//startsWith는 String의 메소드로 해당 문자열로 시작하면 true를 반환한다.
		list.stream().filter( n -> n.startsWith("김") ).forEach( n -> System.out.print(n + " "));
		System.out.println();
		
		//증복 제거 + 김으로 시작하는 것들
		list.stream().distinct().filter( n -> n.startsWith("김") ).forEach( n -> System.out.print(n + " "));
	}
}
