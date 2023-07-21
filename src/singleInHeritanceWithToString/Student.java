package singleInHeritanceWithToString;

public class Student extends Human {
	int id;
	long phoneNo;

	public Student(String name, int age, String gender, int id, long phoneNo) {
		super(name, age, gender);
		this.id = id;
		this.phoneNo = phoneNo;

	}
	public String toString() {
		return (super.toString()+", Student Id:"+id+", PhoneNo:"+phoneNo);
	}

}
