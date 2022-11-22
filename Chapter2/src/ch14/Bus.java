package ch14;

public class Bus {

	int busNumber;
	int passengerCount;
	int money;
	
	//버스번호
	public Bus(int busNumber) {
		this.busNumber=busNumber;
	}
	
	//승차
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	//버스정보
	public void showBusInfo() {
		System.out.println(busNumber+"번 버스의 승객은 "+passengerCount+"이고, 버스 수익은 "+money+"입니다.");
		
	}	
}
