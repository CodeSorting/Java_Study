package 확인용;

public class SwordMan extends Player{
	public SwordMan() {
		this.Level = 0;
		this.AP = 0;
		this.MAP = 0;
	}
	
	public SwordMan(int Level,int AP,int MAP) {
		this.Level = Level;
		this.AP = AP;
		this.MAP = MAP;
	}
	
	@Override
	public void powerUp() {
		this.AP += 10;
	}
}
