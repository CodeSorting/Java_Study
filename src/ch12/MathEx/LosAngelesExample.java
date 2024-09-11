package ch12.MathEx;

import java.util.Calendar;
import java.util.TimeZone;

public class LosAngelesExample {
	public static void main(String[] args) {
		TimeZone timezone = TimeZone.getTimeZone("America/Los_Angeles"); //TimeZone 객체 사용법
		Calendar now = Calendar.getInstance(timezone); //Calander 사용법
		
		int ampm = now.get(Calendar.AM_PM); // YEAR, MONTH, DAY_OF_MONTH(일), DAY_OF_WEEK(요일)
		String strAmpm = null;
		if (ampm==Calendar.AM) {
			strAmpm = "오전";
		}else {
			strAmpm = "오후";
		}
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		System.out.print(strAmpm + " ");
		System.out.print(hour + "시 ");
		System.out.print(minute + "분 ");
		System.out.println(second + "초 ");
		
		String[] availableIDs = TimeZone.getAvailableIDs();
		for (String id : availableIDs) {
			System.out.println(id);
		}
	}
}
