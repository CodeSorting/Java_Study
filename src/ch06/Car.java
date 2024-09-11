package ch06; //클래스

public class Car {
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed; //필드
	
	Car(String model){
		this(model,"은색",250);
	}
	Car(String model,String color){
		this(model,color,250);
	}
	Car(String model,String color, int maxSpeed){ //생성자 오버로딩을 제일 매개변수가 많은 것만 정석으로 하고
		//나머지는 위처럼 선언이 가능하다.
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
