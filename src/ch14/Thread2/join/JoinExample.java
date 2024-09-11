package ch14.Thread2.join;

public class JoinExample {
	public static void main(String[] args) {
		//SumThread가 계산 작업을 모두 마칠 때까지 메인 스레드가 일시 정지 상태에 있다가 SumThread가 최종계산된
		//결과값을 산출하고 종료하면 메인 스레드가 결과값을 받아 출력한다.
		SumThread sumThread = new SumThread();
		sumThread.start();
		try {
			sumThread.join(); //main 스레드 일시정지 후 sumThread가 계산 끝나면 코드를 실행함.
		} catch (InterruptedException e) {}
		System.out.println("1~100의 합 : " + sumThread.getSum());
	}
}
