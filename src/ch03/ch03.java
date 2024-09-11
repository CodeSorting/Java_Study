package ch03;

public class ch03 {
	public static void main(String args[]) {
		//오버 플로우 관찰하기
		byte value = 127;
		value++;
		System.out.println(value); //-128 오버플로우
		value = -128;
		value--;
		System.out.println(value); // 127 언더플로우
		
		// 5/0, 5%0 = ArithmeticException, 5/0.0, 5%0.0은 각각 Infinity, NaN으로 바뀐다.
		// Double.isInfinite(), Double.isNaN()으로 판단 가능
		int x = 5;
		double y = 0.0;
		double z = x/y;
		if (Double.isInfinite(z) || Double.isNaN(z)) {
			System.out.println("값 산출 불가");
		}
		
		
	}
}
