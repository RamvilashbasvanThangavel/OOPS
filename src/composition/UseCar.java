package composition;

public class UseCar {
	public static void main(String[] args) {
		Engine e1 = new Engine();
		e1.brand = "Bs-iV";
		e1.price = 1000000;
		e1.type = "Petrol";

		Car c1 = new Car();
		c1.brand = "Audi";
		c1.price = 5000000;
		c1.isWarranty = true;
		c1.cc = 2000;
		c1.engine = e1;

		System.out.println(c1.brand + "," + c1.price + "," + c1.cc + "," + c1.isWarranty + "," + c1.engine.brand + ","
				+ c1.engine.price + "," + c1.engine.type);
	}

}
