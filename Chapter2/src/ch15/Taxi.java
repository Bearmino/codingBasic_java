package ch15;

public class Taxi {

	String TaxiName;
	int TaxiNumber;
	int TaxiFee;
	int TotalPassenger; 
	
	public Taxi(String TaxiName) {
		this.TaxiName=TaxiName;
	}
	
	public void take(int TaxiNumber,int TaxiFee) {
		this.TaxiNumber = TaxiNumber;
		this.TaxiFee += TaxiFee;
		TotalPassenger++;
	}
	
	public void takeOff(int TotalPassenger) {
		
		this.TotalPassenger -= TotalPassenger;	
	}
	
	public void showTaxiInfo(){
		System.out.println(TaxiName+"운수의 "+TaxiNumber+"번 택시의 총 수입은 "+TaxiFee+"이고, 총 탑승인원은 "+ TotalPassenger +"입니다.");
	}

	
	
	
	
	
	
}
