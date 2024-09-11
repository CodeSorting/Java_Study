package ch07.protect;

import ch07.protect2.D;

public class test {
	public static void main(String[] args) {
		A a = new A();
		D d = new D();
		a.field = "1";
		d.method1();
		System.out.println(a.field);
		System.out.println(d.field);
	}
}
