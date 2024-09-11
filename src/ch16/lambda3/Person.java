package ch16.lambda3;

public class Person {
	public void action(Calculable calculable) {
		double res = calculable.calc(10,40);
		System.out.println("res : " + res);
	}
}
