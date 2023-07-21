package inHeritanceWithToString;

public class Bike extends Vehicle {
	int cc;
	boolean isPetrol;
	
	public Bike(String company,String noOfWheels,int price,String colour,int cc,boolean isPetrol) {
		super(company,noOfWheels,price,colour);
		this.cc=cc;
		this.isPetrol=isPetrol;
		
	}
	public String toString() {
		return (super.toString()+", CC:"+cc+", Is Petrol:"+isPetrol);
	}

}
