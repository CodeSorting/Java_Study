package ch15.Comparable.compare;

import java.util.Comparator;

public class FruitComparator implements Comparator<Fruit> { //따로 인터페이스 구현 클래스를 만들어서 그 안에서 재정의한다.
	@Override
	public int compare(Fruit o1, Fruit o2) {
		if (o1.price<o2.price) return -1;
		else if (o1.price==o2.price) return 0;
		else return 1;
	}
}
