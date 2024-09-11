package ch12.System;

public class RunTime {
	public static void main(String[] args) {
		long time1 = System.nanoTime();
		long sum = 0;
		for (int i=1;i<=1000000;++i) {
			sum += i;
		}
		long time2 = System.nanoTime();
		
		System.out.println("SUM : "+sum);
		System.out.println("계산에 "+(time2-time1)+"나노초 소비");
	}
}
