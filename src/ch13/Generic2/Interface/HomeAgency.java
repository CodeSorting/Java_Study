package ch13.Generic2.Interface;

public class HomeAgency implements Rentable<Home>{
	@Override
	public Home rent() {
		return new Home();
	}
}
