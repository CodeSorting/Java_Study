package 확인용;

public class Wizard extends Player{
	public Wizard() {
		this.Level = 0;
		this.AP = 0;
		this.MAP = 0;
	}
	
	public Wizard(int Level,int AP,int MAP) {
		this.Level = Level;
		this.AP = AP;
		this.MAP = MAP;
	}
	
	@Override
	public void powerUp() {
		this.MAP += 10;
	}
}
