package ch17.Stream3;

import java.util.stream.IntStream;

public class StreamExample_숫자 {
	public static int sum = 0;
	
	public static void main(String[] args) {
		IntStream stream = IntStream.rangeClosed(1,10);
		stream.forEach( p -> System.out.print(p + " ") );
		
		stream = IntStream.rangeClosed(1,10); //stream은 forEach로 한번 순환하면 다시 못 쓰니 다시 선언해주자.
		stream.forEach( a -> sum += a );
		System.out.println("총합 : " + sum);
	}
}
