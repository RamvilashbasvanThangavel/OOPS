package dataAbstractionExInterface;

public class Onesoft implements CourseDetails {
	public int showCourseId(int a) {
		return a;
	}

	public String showCourseName(String course) {
		return course;
	}

	public int showFees(String courseName) {
		if (courseName.equalsIgnoreCase("Java")) {
			return 20000;
		} else if (courseName.equalsIgnoreCase("c++")) {
			return 15000;
		} else if (courseName.equalsIgnoreCase("Python")) {
			return 17000;
		} else {
			return 0;
		}
	}

	public String showTrainer(String name) {
		return name;
	}

}
