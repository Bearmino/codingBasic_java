package ch16;

public class SwitchCaseUpTest {

	public static void main(String[] args) {
		// Java14부터 지원되는 Switch Expression
		
		int month = 3;
		
		int day = switch (month) {
		case 1,3,5,7,8,10,12 ->{
			System.out.println("한 달은 31일 입니다.");
			yield 31;
		}
		case 4,6,9,11 -> {
			System.out.println("한 달은 30일 입니다.");
			yield 30;
		}
		case 2->{
			System.out.println("한 달은 28일 입니다");
			yield 28;
		}
		default ->{
			System.out.println("존재하지 않는 달입니다.");
			yield 0;
		}
		};
		System.out.println(month + "월은"+ day + "일 입니다.");	
		/* yield는 다른 스레드에게 실행을 양보하는 함수
		 *yield() 메소드를 사용하여 다른 스레드에게 실행을 양보하고 자신은 실행 대기 상태로 가는 것이 프로그램 성능에 도움이 된다. 
		 *yield() 메소드를 호출한 스레드는 실행 대기 상태로 돌아가고 동일한 우선순위 또는 높은 우선순위를 갖는 다른 스레드가 실행 기회를 가질 수 있다.
		 */
	}

}
