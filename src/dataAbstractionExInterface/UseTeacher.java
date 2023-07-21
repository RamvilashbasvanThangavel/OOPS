package dataAbstractionExInterface;

public class UseTeacher {
	public static void main(String[] args) {
		Teacher t = new Teacher();
		System.out.println(t.showWork("Freelancer"));
		System.out.println(t.showSalary(50000));
		System.out.println(t.showSubject("Maths"));
	}

}
