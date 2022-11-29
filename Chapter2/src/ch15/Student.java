package ch15;

public class Student {

	String studentName;
	int money;
	
	public Student(String studentName,int money) {
		this.studentName=studentName;
		this.money=money;
	}
	
	public void takeTaxi(Taxi taxi) { //
		taxi.take(11,10000);
		this.money -= 10000;	
	}
	
	public void takeOffTaxi(Taxi taxiOff) {
		taxiOff.takeOff(1);
		
	}
	
	public void showStudent() {
		System.out.println(studentName+"님의 남은 돈은 "+money+"입니다.");
	}

}
