package ch15;

public class TakeTransTexi {

	public static void main(String[] args) {
			Student Edward = new Student("Edward", 20000);
			Taxi taxiGood = new Taxi("잘간다 운수");
			Edward.takeTaxi(taxiGood);
			
			Student Lion = new Student("Lion", 30000);
			Lion.takeTaxi(taxiGood);
			
			
			Edward.showStudent();
			Lion.showStudent();
			
			Edward.takeOffTaxi(taxiGood);
			taxiGood.showTaxiInfo();
			
	}

}
