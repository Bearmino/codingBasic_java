package ch19;

public class Car {
	
	private static int serialNumber = 1000;
	private int carNumber;
	private String carName;
	
	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public Car() {
		serialNumber++;
		carNumber = serialNumber;
	}
	
	public int getCarNumber() {
		return carNumber;
	}
	
	public void setCarNumber(int carNumber) {
		this.carNumber = carNumber;
	}
	
}
