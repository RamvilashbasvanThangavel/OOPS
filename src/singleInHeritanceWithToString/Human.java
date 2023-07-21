package singleInHeritanceWithToString;

public class Human {
	String name;
	int age;
	String gender;

	public Human(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String toString() {
		return ("Name:" + name + ", Age:" + age + ", Gender:" + gender);
	}

}
