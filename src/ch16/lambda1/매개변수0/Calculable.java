package ch16.lambda1.매개변수0;

@FunctionalInterface
public interface Calculable {
	void calculate(int x,int y); //함수형 인터페이스는 오직 1개의 추상 메소드를 가질 수 있다.
}
