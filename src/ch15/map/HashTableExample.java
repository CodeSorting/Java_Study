package ch15.map;

import java.util.Hashtable;
import java.util.Map;

public class HashTableExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new Hashtable<>();
		
		Thread threadA = new Thread() {
			@Override
			public void run() {
				for (int i=1;i<=1000;++i) {
					map.put(String.valueOf(i),i); //String, Integer
				}
			}
		};
		
		Thread threadB = new Thread() {
			@Override
			public void run() {
				for (int i=1001;i<=2000;++i) {
					map.put(String.valueOf(i),i); //String, Integer
				}
			}
		};
		
		threadA.start();
		threadB.start(); // 작업 스레드를 2개 실행하며 hashTable에 두 개의 스레드가 접근해서 에러가 난다.
		
		//따라서 join()으로 a작업 처리 -> b작업 처리 -> main작업 처리가 되도록 해야한다.
		try {
			threadA.join();
			threadB.join();
		} catch (Exception e) {}
		
		int size = map.size();
		System.out.println("총 객체 수 : " + size);
		
	}
}
