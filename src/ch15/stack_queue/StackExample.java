package ch15.stack_queue;

import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {
		Stack<Coin> box = new Stack<>();
		
		box.push(new Coin(1));
		box.push(new Coin(2));
		box.push(new Coin(3));
		box.push(new Coin(4));
		box.push(new Coin(5));
		
		while (!box.isEmpty()) {
			Coin coin = box.peek();
			box.pop();
			System.out.println("꺼내온 동전 : " + coin.getValue() + "원");
		}
	}
}
