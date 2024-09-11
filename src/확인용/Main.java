package 확인용;

public class Main {
	
	static void powerItem(Player player) { //c++과는 다르게 항상 가상 메소드여서 virtual을 안 써도 Player의 객체의 powerUp을 실행 안하고 override된 자식 클래스의 메소드를 실행한다.
		player.powerUp();
	}
	
	public static void main(String[] args) {
		Player player = new Player();
		
		SwordMan character1 = new SwordMan(10,5,5);
		Wizard character2 = new Wizard(10,5,5);
		
		powerItem(character1);
		powerItem(character2);
		
		character1.printStatus();
		character2.printStatus();
	}
}
