package 실습;

import java.util.Scanner;

public class Init {
	public static void init() {
		System.out.println("-----------------------------------------");
		System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
		System.out.println("-----------------------------------------");
		System.out.println("선택> ");
	}
	
	public static void makeAccount() {
		System.out.println("------");
		System.out.println("계좌생성");
		System.out.println("------");
	}
	
	public static void lis() {
		System.out.println("------");
		System.out.println("계좌목록");
		System.out.println("------");
	}
	public static void plus() {
		System.out.println("------");
		System.out.println("예금");
		System.out.println("------");
	}
	public static void minus() {
		System.out.println("------");
		System.out.println("출금");
		System.out.println("------");
	}
}
