package ch06; //배열 매개변수

//매개 변수의 수를 모를 경우 ...(varargs)
public class Computer {
	
	int sum1(int[] values) {
		int sum = 0;
		for(int i=0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	int sum2(int...values) { //가변길이 매개변수
		int sum = 0;
		for(int i=0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
}
