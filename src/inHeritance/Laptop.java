package inHeritance;

public class Laptop extends Electronic {
	int ram;
	String processorName;

	public Laptop(String brand, int price, int warrantyyears, int ram, String processorName) {
		super(brand, price, warrantyyears);
		this.ram = ram;
		this.processorName = processorName;
	}

	public String toString() {
		return (super.toString() + ", Ram:" + ram + ", ProcessorName:" + processorName);
	}

}
