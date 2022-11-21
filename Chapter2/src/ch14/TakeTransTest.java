package ch14;

/*
 * 객체 간의 협력(collabration)
 * 
 *  - 객체 지향 프로그램에서 객체 간에는 협력이 이루어짐
 *  - 협력을 위해서는 필요한 메세지를 전송하고 이를 처리하는 기능이 구현되야 함
 *  - 매개 변수로 객체가 전달되는 경우가 발생 
 *
 * 객체 협력의 예
 * 
 * ┌─학생─┐ 버스를 탄다
 * │ 이름 │ ==========→ 버스 (버스번호,승객 수, 수입)
 * │ 학년 │
 * │ 돈  │ 지하철을 탄다
 * └─────┘ ==========→ 지하철 (노선번호, 승객 수, 수입)
 * 
 */

/*
 * 버스와 지하철을 타는 예제 프로그래밍
 * 
 * minsik과 dongsuk은 각각 버스와 지하철을 타고 학교에 갑니다.
 * minsik은 5000원을 가지고 있었고, 100번 버스를 타면서 1000원을 지불 합니다.
 * dongsuk은 100000원을 가지고 있었고, 초록색 지하철을 타면서 1200원을 지불 합니다.
 * 
 */

public class TakeTransTest {

	public static void main(String[] args) {
		Student studentOh = new Student("minsik" , 5000);	
		Student studentShin = new Student("dongsuk" , 10000);	
		
		Bus bus100 = new Bus(100);
		Subway greenSubway = new Subway("Green");
		
		studentOh.takeBus(bus100);
		bus100.showBusInfo();
		studentOh.showInfo();
		
		System.out.println();
		
		studentShin.takeSubway(greenSubway);
		greenSubway.showSubwayInfo();
		studentShin.showInfo();
		
		
	}

}
