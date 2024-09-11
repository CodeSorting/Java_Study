package ch07.다형성;

public class HanKookTire extends Tire{
	@Override
	public void roll() {
		System.out.println("한국 타이어가 회전합니다.");
	}
}
