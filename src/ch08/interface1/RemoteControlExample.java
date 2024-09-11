package ch08.interface1;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc;
		
		rc = new Television();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		rc.setMute(true);
		rc.setMute(false);
		
		System.out.println();
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		rc.setMute(true);
		rc.setMute(false);
		
		RemoteControl.changeBattery(); //()안에 추상메소드,디폴트메소드,private메소드를 호출할 수 없다.
	    //위 3가지 메소드는 구현 객체가 필요하기 때문이다.
	}
}
