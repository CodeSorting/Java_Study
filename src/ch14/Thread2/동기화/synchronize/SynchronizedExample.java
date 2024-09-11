package ch14.Thread2.동기화.synchronize;

public class SynchronizedExample {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		User1Thread user1Thread = new User1Thread();
		user1Thread.setCaculator(calculator);
		user1Thread.start();
		
		User2Thread user2Thread = new User2Thread();
		user2Thread.setCaculator(calculator);
		user2Thread.start();
	}
}
