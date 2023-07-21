package inHeritance;

public class Electronic {
	String brand;
	int price;
	int warrantyyears;

	public Electronic(String brand, int price, int warrantyyears) {
		this.brand = brand;
		this.price = price;
		this.warrantyyears = warrantyyears;
	}

	public String toString() {
		return ("Brand:" + brand + ", Price:" + price + ", Warrantyyears:" + warrantyyears);
	}
}
