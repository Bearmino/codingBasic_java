package ch14;

public class Subway {

	String lineName;
	int passengerCount;
	int money;
	
	//지하철 라인
	public Subway(String lineName) {
		this.lineName=lineName;
	}
	
	//승차
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	//지하철 정보
	public void showSubwayInfo() {
		System.out.println(lineName+" 지하철의 승객은 "+passengerCount+"이고, 지하철 수익은 "+money+"입니다.");
	}	
}
