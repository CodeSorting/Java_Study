package ch08.interface1;

public interface RemoteControl {
	//상수는 자동적으로 public static final이 된다.
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//추상 메소드
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//디폴트 메소드
	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("무음 처리합니다.");
			setVolume(MIN_VOLUME);
		}
		else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	//정적 메소드
	static void changeBattery() { // public을 안 붙여도 컴파일 과정에서 자동적으로 붙여진다.
		System.out.println("리모콘 건전지를 교환합니다.");
	}
}
