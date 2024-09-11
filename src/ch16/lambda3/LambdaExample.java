package ch16.lambda3;

public class LambdaExample {
	public static void main(String[] args) {
		Person person = new Person();
		
		person.action((x,y) -> {
			double res = x + y;
			return res;
		});
		
		person.action((x,y) -> (x+y)); //리턴문 생략하는 법.
		
		person.action((x,y) -> sum(x,y)); //리턴문을 메소드를 호출해서 돌려보낼 수도 있다.
		
		//person.action((x,y) -> Computer.staticMethod(x,y));와 같다.
		person.action( Computer :: staticMethod );
		
		//instanceMethod 함수는 static 메소드가 아니라서 객체를 선언하고 com :: instanceMethod로 접근해야한다.
	    Computer com = new Computer();
		person.action( com :: instanceMethod );
	}
	
	public static double sum(double x,double y) {
		return x+y;
	}
}
