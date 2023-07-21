package toString;

public class UsePen {
	public static void main(String[] args) {
		Pen p1 = new Pen("Camalin", 50, "Brown");
		p1.setBrand("Natraj");
		Pen p2 = new Pen("Happy", 20, "Black");

		System.out.println(p1 + "\n" + p2);
	}

}
