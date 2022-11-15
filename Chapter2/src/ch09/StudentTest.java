package ch09;

public class StudentTest {

	public static void main(String[]args) {
		
		Student studentOh = new Student(102, "오민식");
		studentOh.setKoreaSubject("국어", 10);
		studentOh.setMathSubject("수학", 20);
		
		Student studentShin = new Student(103, "신동석");
		studentShin.setKoreaSubject("국어", 0);
		studentShin.setMathSubject("수학", 10);
		
		studentOh.showStudentScore();
		studentShin.showStudentScore();
	
	}
	
}
