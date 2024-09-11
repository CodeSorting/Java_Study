package ch15.list;

import java.util.Vector;
import java.util.List;

public class VectorExample {
	public static void main(String[] args) {
		List<Board> list = new Vector<>();
		
		Thread threadA = new Thread() {
			@Override
			public void run() {
				for (int i=1;i<=1000;++i) {
					list.add(new Board("제목"+i,"내용"+i,"글쓴이"+i));
				}
			}
		};
		
		Thread threadB = new Thread() {
			@Override
			public void run() {
				for (int i=1001;i<=2000;++i) {
					list.add(new Board("제목"+i,"내용"+i,"글쓴이"+i));
				}
			}
		};
		
		threadA.start();
		threadB.start();
		
		//작업 스레드가 종료할 때까지 메인 스레드를 기다리게 함. 이 코드가 없으면 A와 B를 시작할 때 size를 출력해서 총 객체수가 0으로 출력됨.
		try {
			threadA.join();
			threadB.join();
		} catch (Exception e) {}
		
		int size = list.size();
		System.out.println("총 객체 수 : " + size);
	}
}
