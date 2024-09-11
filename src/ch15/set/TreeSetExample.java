package ch15.set;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<>();
		
		scores.add(95);
		scores.add(90);
		scores.add(85);
		scores.add(80);
		scores.add(100);
		
		for (Integer s : scores) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		System.out.println("가장 낮은 점수 : " + scores.first());
		System.out.println("가장 높은 점수 : " + scores.last());
		System.out.println("95점 아래 점수 : " + scores.lower(95));
		System.out.println("95점 위의 점수 : " + scores.higher(95));
		System.out.println("95점이거나 바로 아래 점수 : " + scores.floor(95));
		System.out.println("83점이거나 바로 위의 점수 : " + scores.ceiling(83));
		
		NavigableSet<Integer> descendingSet = scores.descendingSet();
		for (Integer s : descendingSet) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		NavigableSet<Integer> rangeSet = scores.tailSet(80, true); //80<=x
		for (Integer s : rangeSet) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		rangeSet = scores.subSet(80, true, 90, false); //80<=x<90
		for (Integer s : rangeSet) {
			System.out.print(s + " ");
		}
	}
}
