package dataAbstractionExInterface;

public class UseOnesoft {
	public static void main(String[] args) {
		Onesoft os = new Onesoft();
		System.out.println("Course Id: " + os.showCourseId(1181));
		System.out.println("Course Name: " + os.showCourseName("Java"));
		System.out.println("Course Fees: " + os.showFees("java"));
		System.out.println("Trainer Name: " + os.showTrainer("Rajesh"));
	}

}
