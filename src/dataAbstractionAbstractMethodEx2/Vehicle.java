package dataAbstractionAbstractMethodEx2;

abstract public class Vehicle {
	public void showSpeed(int speed) {
		System.out.println(speed);
	}
	public void getMileage(int km) {
		System.out.println(km);
	}
	abstract public void breaks();

}
