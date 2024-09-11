package ch09.바깥멤버접근;

public class B {
	//B 인스턴스 필드
	String field = "B-field";
	
	//B 인스턴스 메소드
	void method() {
		System.out.println("B-method");
	}
	
	class C {
		//C 인스턴스 필드
		String field = "C-field";
		
		//C 인스턴스 메소드
		void method() {
			System.out.println("C-method");
		}
		
		//C 인스턴스 메소드
		void print() {
			//C 객체의 필드와 메소드 사용
			System.out.println(this.field);
			this.method();
			
			//B 객체의 필드와 메소드 사용
			System.out.println(B.this.field);
			B.this.method();
		}
	}
	
	//B의 인스턴스 메소드
	void useC() {
		C c = new C();
		c.print();
	}
}
