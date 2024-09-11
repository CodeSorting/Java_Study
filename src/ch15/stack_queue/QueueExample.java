package ch15.stack_queue;

import java.util.Queue;
import java.util.LinkedList;

public class QueueExample {
	public static void main(String[] args) {
		Queue<Message> q = new LinkedList<>();
		q.offer(new Message("sendMail", "홍길동"));
		q.offer(new Message("sendSMS", "신용권"));
		q.offer(new Message("sendKakaotalk", "김자바"));
		
		while (!q.isEmpty()) {
			Message message = q.peek();
			q.poll();
			switch(message.command) {
			case "sendMail":
				System.out.println(message.to + "님에게 이메일을 보냅니다.");
				break;
			case "sendSMS":
				System.out.println(message.to + "님에게 SMS를 보냅니다.");
				break;
			case "sendKakaotalk":
				System.out.println(message.to + "님에게 카카오톡을 보냅니다.");
				break;

			}
		}
	}
}
