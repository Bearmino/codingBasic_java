package ch14;

public class Student {

	String studentName;
	int money;
	
	public Student(String studentName , int money) {
			this.studentName=studentName;
			this.money=money;		
	}
	
	
	public void takeBus(Bus bus) {
		System.out.println(studentName+"학생이 "+this.money+"원을 가지고 탑승했습니다.");
		bus.take(1000);
		this.money-=1000;
		
	}
	
	public void takeSubway(Subway subway) {
		System.out.println(studentName+"학생이 "+this.money+"원을 가지고 탑승했습니다.");
		subway.take(1200);
		this.money-=1200;
	}
	
	public void showInfo() {
		System.out.println(studentName+"학생의 남은 돈은 "+money+"입니다.");
	}
}
