package dataAbstractionAbstractMethodEx3;

public class FormalShirt extends Shirt {
	public void showPrice(int price) {
		System.out.println("Shirt Price: " + price);
	}

	public void showColour(String colour) {
		System.out.println("Shirt Colour: " + colour);
	}

	public void printedOrNot(boolean isPrinted) {
		if (isPrinted == true) {
			System.out.println("Is Printed: " + "Printed");
		} else {
			System.out.println("Is Printed: " + "Not Printed");
		}
	}

}
