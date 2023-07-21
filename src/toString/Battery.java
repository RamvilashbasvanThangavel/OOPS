package toString;

public class Battery {
	String brand;
	int price;
	String capacity;

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	public String getCapacity() {
		return capacity;
	}

	public Battery(String brand, int price, String capacity) {
		this.brand = brand;
		this.price = price;
		this.capacity =capacity;
	}

}
