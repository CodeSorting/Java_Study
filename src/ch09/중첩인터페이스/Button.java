package ch09.중첩인터페이스;

public class Button {
	
	//정적 멤버 인터페이스
	public static interface ClickListener{
		//추상 메소드 선언
		void onClick();
	}
	
	//필드
	private ClickListener clicklistener;
	
	//메소드
	public void setClickListener(ClickListener clicklistener) {
		this.clicklistener = clicklistener;
	}
	
	public void click() {
		this.clicklistener.onClick();
	}
}
