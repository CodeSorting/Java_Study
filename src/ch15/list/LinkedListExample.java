package ch15.list;

import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;

public class LinkedListExample {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		long startTime, endTime;
		
		startTime = System.nanoTime();
		for (int i=0;i<10000;++i) {
			list1.add(0,String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.printf("%-17s %8d ns \n", "ArrayList 걸린 시간 : ",(endTime-startTime));
		
		startTime = System.nanoTime();
		for (int i=0;i<10000;++i) {
			list2.add(0,String.valueOf(i)); //String값이 들어가야하므로 i를 String으로 바꾼다.
		}
		endTime = System.nanoTime();
		System.out.printf("%-17s %8d ns \n", "LinkedList 걸린 시간 : ",(endTime-startTime));
	}
}
