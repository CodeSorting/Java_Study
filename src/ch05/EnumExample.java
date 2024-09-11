package ch05;

import java.util.Calendar;

public class EnumExample {
	public static void main(String args[]) {
		Week today = null;
		Calendar cal = Calendar.getInstance(); // 컴퓨터 날짜 및 시간 정보를 가진 Calendar 객체
		
		int week = cal.get(Calendar.DAY_OF_WEEK); // week 정보 일(1)~토(7) 중에서 숫자 얻기
		
		switch(week) {
		case 1: today = Week.SUNDAY; break;
		case 2: today = Week.MONDAY; break;
		case 3: today = Week.TUESDAY; break;
		case 4: today = Week.WEDNESDAY; break;
		case 5: today = Week.THURSDAY; break;
		case 6: today = Week.FRIDAY; break;
		case 7: today = Week.SATURDAY; break;
		}
		
		if (today==Week.SUNDAY) {
			System.out.println("일요일에는 축구를 합니다.");
		}
		else {
			System.out.println("열심히 자바를 공부합니다.");
		}
	}
}