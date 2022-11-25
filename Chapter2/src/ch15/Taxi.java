package ch15;

public class Taxi {

	String TaxiName;
	int TaxiNumber;
	int TaxiFee;
	int TotalFee;
	int TotalPassenger;
	
	//택시 회사 이름
	public Taxi(String TaxiName) {
		this.TaxiName=TaxiName;
	}
		
	//택시 넘버
	public void number(int TaxiNumber) {
		this.TaxiNumber=TaxiNumber;
	}
	
	//택시 요금
	public void fee(int TaxiFee) {
		this.TaxiFee=TaxiFee;
	}
	
	//승차
	public void take(int TaxiFee) {
		this.TaxiFee = TaxiFee;
		TotalPassenger++;
	}
	

	//택시 총요금
	public void total(int TotalFee) {
		this.TotalFee += TaxiFee;		
	}
	
	
	public void showTaxiInfo(){
		System.out.println(TaxiName+"운수의 "+TaxiNumber+"번 택시의 총 수입은"+TotalFee+"이고, 총 탑승인원은 "+ TotalPassenger +"입니다.");
	}

	
	
	
	
	
	
}
