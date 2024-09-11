package ch12.MathEx;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

public class 형식클래스_정규식 {
	public static void main(String[] args) {
		double num = 1234567.89;
		//숫자 -> 형식화된 문자열
		DecimalFormat df;
		df = new DecimalFormat("#,###");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#,###.0");
		System.out.println(df.format(num));
		
		//simpledateformat = 날짜 -> 형식화된 문자열
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("yyyy.MM.dd a HH:mm:ss");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("오늘은 E요일");
		System.out.println(sdf.format(now));
		
		//정규표현식
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		String data = "010-1234-5678";
		boolean res = Pattern.matches(regExp, data);
		if (res) {
			System.out.println("정규식과 일치합니다.");
		} else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
	}
}
