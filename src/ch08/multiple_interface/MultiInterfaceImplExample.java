package ch08.multiple_interface;

public class MultiInterfaceImplExample {
	public static void main(String[] args) {
		//RemoteControl 인터페이스 변수 선언 및 구현 객체 대입
		RemoteControl rc = new SmartTelevision();
		
		rc.turnOn();
		rc.turnOff();
		//rc.search("T"); 이건 안됨. RemoteControl에서는 turnOn,turnOff만 정의했기 때문이다.
		
		//Searchable 인터페이스 변수 선언 및 구현 객체 대입
		Searchable searchable = new SmartTelevision();
		searchable.search("https://www.youtube.com");
	}
}
