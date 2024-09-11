package 실습;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number;
		String tmp1;
		String tmp2;
		long tmp3;
		Account arr = new Account();
		
		while (true) {
			Init.init();
			number = in.nextInt();
			if (number==5) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			if (number==1) { // 계좌 생성
				Init.makeAccount();
				
				System.out.print("계좌번호:");
				tmp1 = in.next();
				System.out.print("계좌주:");
				tmp2 = in.next();
				System.out.print("초기입금액:");
				while (true) {
					tmp3 = in.nextLong();
					if (tmp3>0) {
						break;
					}
					System.out.println("1원 이상으로 입금해주시기 바랍니다.");
				}
				
				arr.setn(tmp1);
				arr.setName(tmp2);
				arr.setInitMoney(tmp3);
				arr.size++; //사이즈 +1
				System.out.println("결과 : 계좌가 생성되었습니다.");
			}
			else if (number==2) { //계좌 목록
				Init.lis();
				if (arr.size==0) {
					System.out.print("생성된 계좌가 없습니다.");
				    break;
				}
				for (int i=0;i<arr.size;++i) {
					System.out.print(arr.getn(i)+'\t');
					System.out.print(arr.getName(i)+'\t');
					System.out.print(arr.getInitMoney(i));
					System.out.println();
				}
			}
			else if (number==3) { //예금
				Init.plus();
				boolean notfind = true;
				while (true) {
					System.out.print("계좌번호:");
					tmp1 = in.next();
					for (int i=0;i<arr.size;++i) {
						if (arr.getn(i).equals(tmp1)) {
							arr.num = i;
							notfind = false;
							break;
						}
					}
					if (!notfind) break;
					if (notfind) System.out.println("계좌번호를 잘못 입력했습니다.");
				}
				System.out.print("예금액:");
				while (true) {
					tmp3 = in.nextLong();
					if (tmp3>0) break;
					System.out.print("금액을 양수로 입력하시오.");
				}
				arr.plusMoney(tmp3);
			}
			else if (number==4) { //출금
				Init.minus();
				boolean notfind = true;
				while (true) {
					System.out.print("계좌번호:");
					tmp1 = in.next();
					for (int i=0;i<arr.size;++i) {
						if (arr.getn(i).equals(tmp1)) {
							arr.num = i;
							notfind = false;
							break;
						}
					}
					if (!notfind) break;
					if (notfind) System.out.println("계좌번호를 잘못 입력했습니다.");
				}
				System.out.print("출금액:");
				while (true) {
					tmp3 = in.nextLong();
					if (tmp3<0) break;
					System.out.print("금액을 음수로 입력하시오.");
				}
				arr.minusMoney(tmp3);
			}
		}
	}
}
