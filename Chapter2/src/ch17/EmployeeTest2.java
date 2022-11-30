package ch17;

/*
 *변수의 유효 범위와 메모리
 * 변수의 유효범위와 생성과 소멸은 각 변수의 종류마다 다르다. 
 * 지역변수, 멤버변수, 클래스변수 모두 유효범위와 life cycle,메모리가 모두 다르다
 * 
 * 지역변수(함수내부에 선언)
 *  사용범위 : 함수내부에 사용
 *  메모리 : 스택
 *  Life cycle : 함수가 호출될 때 생성되고 함수가 끝나면 소멸
 *  
 * 멤버변수(클래스내부에 선언)
 *  사용범위 : 클래스 내부에서 사용,private를 제외한 참조변수로 다른 클래스 사용 가능
 *  메모리 : 힙
 *  Life cycle : 인스턴스가 생성될 때 생성되고, 가비지 컬렉터가 메모리를 수거할 때 소멸
 *
 * static변수(static예약어를 사용하여 클래스 내부 선언)
 *  사용범위 : 클래스 내부에서 사용하고 private이 아니면 클래스 이름으로 다른 클래스 사용 가능
 *  메모리 : 데이터 영역
 *  Life cycle : 프로그램이 처음 시작 시 상수와 함께 데이터 영역에 생성 된 후 프로그램 끝나고 메모리 해제 시 소멸
 *  
 *static 변수의 경우 프로그램이 메모리에 상주할 동안 그 영역을 계속 차지하기에, 너무 큰 메모리를 할당하는 것은 좋지 않음 
 *클래스 내부의 여러 메서드에서 사용하는 변수는 멤버 변수로 선언하는 것이 좋음 
 *멤버 변수가 너무 많으면 인스턴스 생성 시 쓸데없는 메모리 할당
 *   
 */

public class EmployeeTest2 {

	public static void main(String[] args) {
		
		System.out.println(Employee.getSerialNum());
		Employee.setSerialNum(1003);
		System.out.println(Employee.getSerialNum());
		
	}

}
