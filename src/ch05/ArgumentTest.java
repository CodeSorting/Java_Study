package ch05;

public class ArgumentTest {
	public static void main(String args[]) {
		// cmd 내부에서는 폴더를 이동한 뒤 java ch05.ArgumentTest 10 20으로 치면 된다.
		if (args.length != 2) {
			System.out.println("프로그램 입력값이 부족");
			System.exit(0);	
		}
		
		String strnum1 = args[0];
		String strnum2 = args[1];
		
		int num1 = Integer.parseInt(strnum1);
		int num2 = Integer.parseInt(strnum2);
		
		int res = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + res);
	}
}
