package ch14;

public class Subway {

	String lineName;
	int passengerCount;
	int money;
	
	//버스번호
	public Subway(String lineName) {
		this.lineName=lineName;
	}
	
	//승차
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	//지하철정보
	public void showSubwayInfo() {
		System.out.println(lineName+" 지하철의 승객은 "+passengerCount+"이고, 수입은 "+money+"입니다.");
		
	}	
}
