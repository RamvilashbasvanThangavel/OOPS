package inHeritanceWithToString;

public class Vehicle {
	String company;
	String noOfWheels;
	int price;
	String colour;
	
	public Vehicle(String company,String noOfWheels,int price,String colour ) {
		this.company=company;
		this.noOfWheels=noOfWheels;
		this.price=price;
		this.colour=colour;
	}
	public String toString() {
		return ("Company: "+company+", NoOfWheels: "+noOfWheels+", Price: "+price+", Colour:"+colour);
	}
	

}
