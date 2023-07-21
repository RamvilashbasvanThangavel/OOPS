package inHeritance;

public class UseLaptop {
	public static void main(String[] args) {
//		Laptop lap1 = new Laptop();
//		lap1.brand = "Dell";
//		lap1.price = 765000;
//		lap1.warrantyyears = 3;
//		lap1.ram = 16;
//		lap1.processorName = "i5-Processor";
//
//		System.out.println(lap1.brand + "- Price:" + lap1.price + ", WarrantyYears" + lap1.warrantyyears + ", Ram:"
//				+ lap1.ram + ", ProccessorName:" + lap1.processorName);
		
		Laptop l1 = new Laptop("Lenovo",60000,5,8,"i3-Processor");
		System.out.println(l1);
	}

}
