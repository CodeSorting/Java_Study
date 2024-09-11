package ch02;

public class ch02 {
	public static void main(String args[]) {
		int hour = 3;
		int minute = 5;
		System.out.println(hour + "시간 " + minute + "분");
		
		int totalminute = hour*60 + minute;
		System.out.println("총 " + totalminute + "분");
		
		int x = 0b1011; // 2진수 11
		byte y = 013; // 8진수 11
		int z = 0xB3; // 16진수 179
		System.out.println(x+y+z);
		
		y = 127; // byte 는 127이 최대이다.
		// long var1 = 10000000000000 컴파일러는 int로 간주해서 에러가 발생한다.
		long var1 = 10000000000000L; // int 범위를 넘을 경우 뒤에 L을 붙여줘야한다.
		System.out.println(var1);
		float var2 = 0.1234567891123f; // 기본이 double이니 float면 뒤에 f나 F를 붙여야한다.
		double var3 = 0.1234567891123;
		System.out.println("var2 : " + var2);
		System.out.println("var3 : " + var3); // var3에 비해 var2는 7자리까지만 유효하다.
		
		boolean stop = true;
		boolean result = (hour==20); //false
		
		String str = """
				{
				"id":"winter",
			    "name":"눈송이"
			    }
				""";
		System.out.println(str);
		String str2 = """
				나는 자바를 \
				학습합니다.
				나는 자바 고수가 될것이다.
				"""; // \를 넣으면 밑줄에 써도 그대로 이어간다. 파이썬과 똑같음.
		System.out.println(str2);
		// 자동 타입 변환 : 값의 허용범위가 낮음 -> 높은 타입으로 대입될 때 발생
		long longvalue = 5000000000L;
		float floatvalue = longvalue; // 5.0E9f로 저장됨.
		double doublevalue = longvalue; // 5.0E9로 저장됨.
		double $value = 3.14;
		System.out.printf("파이는 : %2.2f",$value); //정수부분 : 2-1, 소수부분 : 2
		
		
	}
}
