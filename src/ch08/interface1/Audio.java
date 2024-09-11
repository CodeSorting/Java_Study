package ch08.interface1;

public class Audio implements RemoteControl{
    private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다");
	}
	
	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다");
	}
	
	@Override
	public void setVolume(int volume) {
		if (volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}
		else if (volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}
		else {
			this.volume = volume;
		}
		System.out.println("현재 Audio 볼륨 : " + this.volume);
	}
	
	private int memoryVolume; // temp처럼 무음 처리하고 다음 뮤트해제까지 데이터를 남겨놓기 위해 저장해둠.
	
	@Override
	public void setMute(boolean mute) { //디폴트 메소드를 오버라이딩할 때 default를 생략하고 public을 붙여야한다.
		if (mute) {
			this.memoryVolume = this.volume;
			System.out.println("무음 처리합니다.");
			setVolume(RemoteControl.MIN_VOLUME);
		}
		else {
			System.out.println("무음 해제합니다.");
			setVolume(this.memoryVolume);
		}
	}
}
