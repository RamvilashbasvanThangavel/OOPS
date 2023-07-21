package singleInHeritanceWithToString;

public class EngineeringStudent extends Student{
	String dept;
	String hodName;
	
	public EngineeringStudent(String name,int age,String gender,int id,long phoneNo,String dept,String hodName) {
		super(name,age,gender,id,phoneNo);
		this.dept=dept;
		this.hodName=hodName;
	}
	public String toString() {
		return (super.toString()+", Department:"+dept+", Hod Name:"+hodName);
	}

}
