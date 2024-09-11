package ch09.중첩인터페이스;

public class ButtonExample {
	public static void main(String[] args) {
		Button btnOk = new Button();
		
		class OkListener implements Button.ClickListener{ //구현 객체 클래스 선언
			@Override
			public void onClick() {
				System.out.println("Ok버튼을 클릭했습니다");
			}
		}
		
		btnOk.setClickListener(new OkListener());
		
		btnOk.click();
		
		
		Button btnCancel = new Button();
		class CancelListener implements Button.ClickListener{ //구현 객체 클래스 선언
			@Override
			public void onClick() {
				System.out.println("Cancel버튼을 클릭했습니다");
			}
		}
		
		btnCancel.setClickListener(new CancelListener());
		
		btnCancel.click(); 
	}
}