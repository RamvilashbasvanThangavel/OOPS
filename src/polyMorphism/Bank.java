package polyMorphism;

public class Bank {
	public int loan() {
		return 50000;
	}

	public int loan(int salary) {
		return salary * 10 + 50000;
	}

	public int loan(int salary, int propertyValue) {
		return salary * 10 + propertyValue + 50000;
	}

	public int loan(String location) {
		if (location.equalsIgnoreCase("Chennai")) {
			return 30000;
		} else {
			return 0;
		}
	}

}
