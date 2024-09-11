package ch12.MathEx;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {
	public static void main(String[] args) {
		//Math.abs(-5) = 5, 올림 : ceil,버림 : floor,최대,최소 : max,min,랜덤 : random,반올림 : round가 있다.
		
		//선택번호
		int[] selectNumber = new int[6]; //Math 대신 Random 클래스를 이용할 수도 있다.
		Random random = new Random();
		System.out.print("선택번호 : ");
		for (int i=0;i<6;++i) {
			selectNumber[i] = random.nextInt(45) + 1;
			System.out.print(selectNumber[i] + " ");
		}
		System.out.println();
		
		//당첨번호
		int[] winningNumber = new int[6]; //Math 대신 Random 클래스를 이용할 수도 있다.
		random = new Random();
		System.out.print("당첨번호 : ");
		for (int i=0;i<6;++i) {
			winningNumber[i] = random.nextInt(45) + 1;
			System.out.print(winningNumber[i] + " ");
		}
		System.out.println();
		
		//당첨여부
		Arrays.sort(selectNumber); //오름차순 정렬
		Arrays.sort(winningNumber);
		boolean res = Arrays.equals(selectNumber, winningNumber);
		System.out.print("당첨여부 : ");
		if (res) {
		    System.out.println("1등에 당첨되었습니다.");
		}else {
			System.out.println("아쉽지만 다음에...");
		}
	}
}
