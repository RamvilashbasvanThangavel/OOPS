package enCapsulation;

public class Student {
	private String name;
	private int classes;
	private int marks;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setClasses(int classes) {
		this.classes = classes;
	}

	public int getClasses() {
		return classes;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public int getMarks() {
		return marks;
	}

}
