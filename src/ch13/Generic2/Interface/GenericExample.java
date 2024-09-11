package ch13.Generic2.Interface;

public class GenericExample {
	public static void main(String[] args) {
		HomeAgency homeagency = new HomeAgency();
		Home home = homeagency.rent();
		home.turnOnLight();
		
		CarAgency caragency = new CarAgency();
		Car car = caragency.rent();
		car.run();
	}
}
