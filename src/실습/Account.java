package 실습;

public class Account {
	private String[] n = new String[101];
	private String[] name = new String[101];
	private long[] initMoney = new long[101];
	int num = 1;
	int size = 0;
	
	public String getn(int i) { //게터
		return n[i];
	}
	public String getName(int i) {
		return name[i];
	}
	public long getInitMoney(int i) {
		return initMoney[i];
	}
	
	public void setn(String tmp) { //세터
		n[this.size] = tmp;
	}
	public void setName(String tmp) {
		name[this.size] = tmp;
	}
	public void setInitMoney(long money) { //계좌 생성할 때 초기 돈값
	    initMoney[this.size] = money;
	}
	
	public void plusMoney(long Money) { //예금
		initMoney[this.num] += Money;
	}
	public void minusMoney(long Money) { //출금
		initMoney[this.num] -= Money;
	}
}
