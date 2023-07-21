package toString;

public class UseLaptop {
	public static void main(String[] args) {
		// with composition method.
//		Battery b1 = new Battery();
//		b1.brand = "lead";
//		b1.price = 2800;
//		b1.capacity="160-v";
//		
//		Laptop laptop1 = new Laptop();
//		laptop1.brand="Dell";
//		laptop1.ram=16;
//		laptop1.model="Vostrao";
//		laptop1.colour="Silver";
//		laptop1.battery=b1;
//		System.out.println(laptop1.brand+"-"+laptop1.ram+","+laptop1.model+","+laptop1.colour+","+laptop1.battery.brand+","+laptop1.battery.price+","+laptop1.battery.capacity);

		// with enCapsulation method.
//		Battery bat = new Battery();
//		bat.setBrand("Lead");
//		bat.setPrice(2500);
//		bat.setCapacity("16v");
//		
//		Laptop lap1 = new Laptop(); 
//		lap1.setBrand("Lenovo");
//		lap1.setRam(16);
//		lap1.setModel("ThinK Pad");
//		lap1.setColour("Black");
//		lap1.setBattery(bat);	
//		System.out.println(lap1.getBrand()+"-"+lap1.getRam()+","+lap1.getModel()+lap1.getColour()+","+lap1.getBattery().getBrand()+","+lap1.getBattery().getPrice()+","+lap1.getBattery().getCapacity());

		// with Constructor method.
//	    Battery b1 = new Battery("lead",1800,"16v");
//	    Laptop la1 = new Laptop("Hp",8,"Pavillion","White",b1);
//	    System.out.println(la1.brand+"-"+la1.ram+","+la1.model+","+la1.colour+","+la1.battery.brand+","+la1.battery.price+","+la1.battery.capacity);

		// with to String Method.
		Battery ba1 = new Battery("lead", 3000, "16v");
		Laptop l1 = new Laptop("Apple", 8, "Mac-3", "White", ba1);
		System.out.println(l1);

	}

}
