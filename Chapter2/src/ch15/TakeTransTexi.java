package ch15;

public class TakeTransTexi {

	public static void main(String[] args) {
			Student Edward = new Student("Edward", 20000);
			Taxi taxiWel = new Taxi("잘 간다");
			Edward.takeTaxi(taxiWel);
			
			Edward.showStudent();
			taxiWel.showTaxiInfo();
			
	}

}
