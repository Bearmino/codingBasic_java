package ch06;

/*
 * 생성자(Constructor)
 * 생성자 기본문법 <class name>([argument_list]){[<statement]}
 * 객체를 생성할 때 new 키워드와 함께 사용
 * 생성자는 일반함수처럼 기능 호출이 아닌 객체를 생성하기 위해 new와 함께 사용
 * 객체가 생성될 때 변수나 상수를 초기화 하거나 다른 초기화 기능을 수행하는 메서드를 호출
 * 생성자는 반환값이 없고, 클래스의 이름과 동일(★중요)
 * 대부분의 생성자는 외부에서 접근이 가능하며 필요에 의해 private으로 선언하는 경우 있음
 * 
 */
/*
 * 기본 생성자(default constructor)
 * 클래스에는 반드시 하나 이상의 생성자가 존재
 * 클래스에 생성자를 구현하지 않아도 new 키워드와 함께 생성자를 호출 가능
 * 클래스에 생성자가 하나도 없는 경우 컴파일러가 생성자 코드를 넣음
 * 예제) public Student(){}
 * 매개 변수가 없음, 구현부가 없음
 */

public class Student {
	
	public int studentNumber;
	public String studentName;
	public int grade;
	
	public Student(int studentNumber, String studentName, int grade) {
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		this.grade = grade;
	}
	
	public String showStudentInfo() {
		return studentName+"학생의 학번은 "+ studentNumber+"이고, "+grade+"학년 입니다.";
	}
	
}
