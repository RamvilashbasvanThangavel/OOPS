package enCapsulation;

public class UseMobile {
	public static void main(String[] args) {
		Battery battery1 = new Battery();
		battery1.setBrand("logo");
		battery1.setCapacity("125-v");

		Mobile mobile1 = new Mobile();
		mobile1.setBrand("VIVO");
		mobile1.setPrice(40000);
		mobile1.setColor("Blue");
		mobile1.setBattery(battery1);

		System.out.println(mobile1.getBrand() + "-" + mobile1.getColor() + "-" + mobile1.getPrice());
		System.out.println(mobile1.getBattery().getBrand() + "," + mobile1.getBattery().getCapacity());
	}

}
 