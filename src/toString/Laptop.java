package toString;

public class Laptop {
	String brand;
	int ram;
	String model;
	String colour;
	Battery battery;
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setRam(int ram) {
		this.ram=ram;
	}
	public int getRam() {
		return ram;
	}
	public void setModel(String model) {
		this.model=model;
	}
	public String getModel() {
		return model;
	}
	public void setColour(String colour) {
		this.colour=colour;
	}
	public String getColour() {
		return colour;
	}
	public void setBattery(Battery battery) {
		this.battery=battery;
	}
	public Battery getBattery() {
		return battery;
	}	
	public Laptop(String brand,int ram,String model,String colour,Battery battery) {
		this.brand = brand;
		this.ram = ram;
		this.model = model;
		this.colour = colour;
		this.battery = battery;
	}
	public String toString() {
		return ("Brand="+brand+","+"Ram="+ram+", Model="+model+", Colour="+colour+", Battery Brand="+battery.brand+", Battery Price="+battery.price+
				", Battery Capacity="+battery.capacity);
	}
	}
