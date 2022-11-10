package ch04;

/*
 * 생성한 Student클래스에서 생성된 객체(인스턴스)에 각각 다른 이름과 주소를 대입
 */

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student(); // studentLee라는 객체를 선언
		studentLee.studentID = 1574875;
		studentLee.studentName = "신동석";
		studentLee.address = "성남시";
		
		studentLee.showStudentInfo(); //StudentLee에 대한 정보값 출력
		
		Student studentKim = new Student(); // studentKim이라는 객체를 선언
		
		studentKim.studentID = 1575178;
		studentKim.studentName = "오민식";
		studentKim.address = "용인시";
		
		studentKim.showStudentInfo(); //StudentKim에 대한 정보값 출력
			
	}

}
