package dataAbstractionWithMultipleInheritanceInterface;

public class Car implements Vehicle, Transport {

	public String vehicleNo(String vNo) {
		return vNo;
	}

	public String type(String board) {
		if (board.equalsIgnoreCase("Light")) {
			return "Own Car";
		} else if (board.equalsIgnoreCase("Batch")) {
			return "Taxi";
		} else {
			return "Heavy Transports";
		}
	}
}
