package composition;

public class UseBike {
	public static void main(String[] args) {
		Tyre tyre1 = new Tyre();
		tyre1.name = "Apllo";
		tyre1.price = 1800;
		tyre1.size = 15.8f;
		tyre1.isWarranty = true;
 
		Bike bike1 = new Bike();
		bike1.brand = "Tvs-Jupiter";
		bike1.price = 800000;
		bike1.warrantyYears = 3;
		bike1.tyre = tyre1;

		System.out.println(bike1.brand + "," + bike1.price + "," + bike1.warrantyYears + "," + bike1.tyre.name + ","
				+ bike1.tyre.price + "," + bike1.tyre.size + "," + bike1.tyre.isWarranty);
	}

}
