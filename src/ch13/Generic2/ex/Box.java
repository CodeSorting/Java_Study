package ch13.Generic2.ex;

public class Box<T>{
	public T content;
	
	public boolean compare(Box<T> other) {
		boolean res = content.equals(other.content);
		return res;
	}
}
