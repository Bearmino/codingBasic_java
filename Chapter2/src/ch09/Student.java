package ch09;

/*
 * 참조 자료형
 * 기본 자료형 - int, long, float, double 등
 * 참조 자료형 - String,Date,Student 등
 * 
 * 클래스(class)형으로 변수를 선언
 * 기본 자료형은 사용하는 메모리 크기가 정해져 있지만, 참조형은 클래스에 따라 다름
 * 참조 자료형을 사용 시 해당 변수에 대해 생성해야 함
 * (String 클래스는 예외적으로 생성하지 않고 사용이 가능함)
 * 
 * 참조 자료형 정의하기 예제 실습
 * 학생(Student)과 과목(Subject)에 대한 클래스를 분리하여 사용하고 Subject클래스를 활용하여 수강한 과목을 변수타입으로 선언 후 총계를 구하시오.
 * 
 */

public class Student {

	int studentId;
	String studentName;
	
	Subject korea = new Subject();
	Subject math = new Subject();
	
	public Student(int id,String name) {
		studentId=id;
		studentName=name;		
	}
	
	public void setKoreaSubject(String name, int score) {
		korea.subjectName = name;
		korea.score = score;
	}
	
	public void setMathSubject(String name, int score) {
		math.subjectName = name;
		math.score = score;
	}
	
	public void showStudentScore() {
		int total = korea.score + math.score;
		System.out.println(studentName + "학생의 총점은 "+ total +"입니다.");
	}
	
		
}
