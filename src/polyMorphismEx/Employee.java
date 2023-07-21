package polyMorphismEx;

public class Employee {
	public String weekoff() {
		return "WeakOff is Saturday and Sunday";
	}

	public int calculateSalary(int exp) {
		if (exp >= 3) {
			return 25000;
		} else {
			return 15000;
		}
	}

}
