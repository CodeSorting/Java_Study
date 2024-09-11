package ch16.lambda1.매개변수0;

public class LambdaExample {
	public static void main(String[] args) {
		action((x,y)->{
			int res = x + y;
			System.out.println("res : " + res);
		});
		
		action((x,y)->{
			int res = x - y;
			System.out.println("res : " + res);
		});
	}
	
	public static void action(Calculable calculable) {
		int x = 10;
		int y = 4;
		calculable.calculate(x,y);
	}
}
