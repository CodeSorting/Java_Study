package ch12.MathEx;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeOperationExample {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");
		System.out.println("현재 시간 : " + now.format(dtf));
		
		LocalDateTime res1 = now.plusYears(1);
		System.out.println("1년 덧셈 : " + res1.format(dtf));
		
		LocalDateTime res2 = now.minusMonths(2);
		System.out.println("2개월 뺄셈 : " + res2.format(dtf));
		
		LocalDateTime res3 = now.plusDays(7);
		System.out.println("7일 덧셈 : " + res3.format(dtf));
	}
}
