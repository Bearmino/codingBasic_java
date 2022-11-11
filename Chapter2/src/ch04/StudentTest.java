package ch04;

/*
 * 생성한 Student클래스에서 생성된 객체(인스턴스)에 각각 다른 이름과 주소를 대입
 */

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentshin = new Student(); // studentLee라는 객체를 선언
		studentshin.studentID = 1574875;
		studentshin.studentName = "신동석";
		studentshin.address = "성남시";
		
		studentshin.showStudentInfo(); //StudentLee에 대한 정보값 출력
		
		Student studentOh = new Student(); // studentKim이라는 객체를 선언
		
		studentOh.studentID = 1575178;
		studentOh.studentName = "오민식";
		studentOh.address = "용인시";
		
		studentOh.showStudentInfo(); //StudentKim에 대한 정보값 출력
			
	}

}

/* <인스턴스 생성과 힙 메모리(heap memory)>
 * 
 * 인스턴스(instance)
 * 클래스는 객체의 속성을 정의하고, 기능을 구현하여 만들어 놓은 상태
 * 실제 클래스를 기반으로 생성된 객체(인스턴스)는 각각 다른 멤버 변수 값을 가지고 있다.
 * 위 코드처럼 학생 클래스에서 생성된 각각의 인스터스는 각각 다른 이름,학번,주소등을 가지게 된다.
 * new 키워드를 사용하여 인스턴스 생성
 * 
 * 힙 메모리
 * 생성한 객체(인스턴스)는 동적메모리(heap memory)에 할당됨
 * c,c++에서는 사용한 동적메모리를 프로그래머가 해제 시켜줘야함
 * 자바에선 가비지콜렉터(Gabage Collector)가 주기적으로 사용하지 않는 메모리 수거
 * 
 * ★중요★
 * 하나의 클래스로부터 여러개의 인스턴스가 생성되고 각각 다른 메모리 주소를 가지게 된다.
 * 
 */

/*
 * 용어설명
 * 객체 : 객체 지향 프로그램의 대상, 생성된 인스턴스
 * 클래스 : 객체를 프로그래밍 하기 위해 코드를 정의
 * 인스턴스 : new 키워드를 사용하여 클래스를 메모리에 생성
 * 멤버 변수 : 클래스의 속성, 특성
 * 메서드 : 멤버 변수를 이용하여 클래스의 기능을 구현
 * 참조 변수 : 메모리에 생성된 인스턴스를 가르키는 변수
 * 참조 값 : 생성된 인스턴스의 메모리 주소 값
 * 
 */

