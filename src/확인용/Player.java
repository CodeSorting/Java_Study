package 확인용;

public class Player {
	public int Level;
	public int AP;
	public int MAP;
	
	public Player() {
		this.Level = 0;
		this.AP = 0;
		this.MAP = 0;
	}
	public Player(int Level,int AP,int MAP) {
		this.Level = Level;
		this.AP = AP;
		this.MAP = MAP;
	}
	
	void powerUp() {}
	
	void printStatus() {
		System.out.println("레벨:" + this.Level + " 공격력: " + this.AP + " 마력: " + this.MAP);
	}
}
