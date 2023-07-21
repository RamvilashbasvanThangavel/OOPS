package dataAbstractionAbstractMethodEx3;

public class UseFormalShirt {
	public static void main(String[] args) {
		int a = 500;
		String b = "Blue";
		boolean c = true;
		FormalShirt fs = new FormalShirt();
		fs.showPrice(a);
		fs.showColour(b);
		fs.printedOrNot(c);
	}

}
