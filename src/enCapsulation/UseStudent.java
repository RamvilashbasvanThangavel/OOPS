package enCapsulation;

public class UseStudent {
	public static void main(String[] args) {
	Student student1 = new Student();
	student1.setName("Raja");
	student1.setClasses(10);
	student1.setMarks(98);
	System.out.println(student1.getName());
	System.out.println(student1.getClasses());
	System.out.println(student1.getMarks());
	}
}
