package ch06; //게터와 세터 이용

public class Car3 {
	private int speed;
	private boolean stop;
	
	public int getSpeed() { //게터
		return speed; 
	}
	public void setSpeed(int speed) { //세터
		if (speed<0) {
			this.speed = 0;
		}
		else {
			this.speed = speed;
		}
	}
	
	public boolean isStop() {
		return stop;
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
		if (stop==true) this.speed = 0; //멈추면 속도는 0
	}
	
}
