package dataAbstractionAbstractMethodEx;

abstract public class Animal {
	public void sleep() {
		System.out.println("Sleeping");
	}

	public void eat() {
		System.out.println("Eating");
	}

	abstract public void sound();

}
