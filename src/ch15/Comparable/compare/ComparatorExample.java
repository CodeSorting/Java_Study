package ch15.Comparable.compare;

import java.util.TreeSet;

public class ComparatorExample {
	public static void main(String[] args) {
		//treeset을 생성할 때 비교자 안에 재정의한 comparator를 넣는다.
		TreeSet<Fruit> treeSet = new TreeSet<>(new FruitComparator());
		
		treeSet.add(new Fruit("포도",5000));
		treeSet.add(new Fruit("수박", 30000));
		treeSet.add(new Fruit("딸기", 6000));
		for (Fruit fruit : treeSet) {
			System.out.println(fruit.name + ":" + fruit.price);
		}
	}
}
