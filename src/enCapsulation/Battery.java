package enCapsulation;

public class Battery {
	private String brand;
	private String capacity;

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	public String getCapacity() {
		return capacity;
	}

}
