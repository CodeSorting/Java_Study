package ch17.Stream5;

import java.util.Arrays;

public class 요소기본집계 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		//카운팅
		long count = Arrays.stream(arr).filter(n -> n%2==0).count();
		System.out.println("2의 배수 개수: " + count);
		
		//총합
		long sum = Arrays.stream(arr).filter(n -> n%2==0).sum();
		System.out.println("2의 배수 합: " + sum);
		
		//평균
		double avg = Arrays.stream(arr).filter(n -> n%2==0).average().getAsDouble();
		System.out.println("2의 배수 평균: " + avg);
		
		//최대,최소
		int max = Arrays.stream(arr).filter(n -> n%2==0).max().getAsInt();
		System.out.println("2의 배수 중 최대: " + max);
		int min = Arrays.stream(arr).filter(n -> n%2==0).min().getAsInt();
		System.out.println("2의 배수 중 최소: " + min);
		
		//첫번째요소
		int first = Arrays.stream(arr).filter(n -> n%2==0).findFirst().getAsInt();
		System.out.println("첫 번째 2의 배수:" + first);
	}
}
