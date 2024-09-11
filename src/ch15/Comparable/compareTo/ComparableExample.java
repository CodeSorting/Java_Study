package ch15.Comparable.compareTo;

import java.util.TreeSet;

public class ComparableExample {
	public static void main(String[] args) {
		TreeSet<Person> tree = new TreeSet<>();
		tree.add(new Person("홍길동", 45));
		tree.add(new Person("최종빈", 25));
		tree.add(new Person("자바", 31));
		
		for (Person person : tree) {
			System.out.println(person.name + " : " + person.age);
		}
	}
}
