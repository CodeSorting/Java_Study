package ch16.lambda4;

public class MethodReferenceExample {
	public static void main(String[] args) {
		Person person = new Person();
		person.ordering( String :: compareToIgnoreCase );
		/*
		람다식이 없다면
		person.ordering(new Comparable() {
            @Override
            public int compare(String a, String b) {
                // String 클래스의 compareToIgnoreCase 메서드를 호출
                return a.compareToIgnoreCase(b);
            }
        }); 이렇게 표현할 수 있다.
		 */
	}
}
