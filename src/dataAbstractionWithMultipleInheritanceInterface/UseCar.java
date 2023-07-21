package dataAbstractionWithMultipleInheritanceInterface;

public class UseCar {
	public static void main(String[] args) {
		String a = "TN24XY1994";
		String b = "Batch";
		Car c = new Car();
		System.out.println("Vehicle NO : " + c.vehicleNo(a));
		System.out.println("Type of TransPort : " + c.type(b));
	}

}
