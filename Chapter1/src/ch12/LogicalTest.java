package ch12;

public class LogicalTest {

	public static void main(String[] args) {
		
		int num1=10;
		int num2=20;
		
		boolean flag = (num1>0) && (num2>0);
		System.out.println(flag);
		
		flag = (num1<0) && (num2<0);
		System.out.println(flag);
		//두 항이 모두 참인 경우에만 결과값이 참
		
		flag = (num1>0) || (num2>0);
		System.out.println(flag);
		//두 항 중 하나의 항만 참이면, 결과값은 참
		
		flag = (num1<0) || (num2<0);
		System.out.println(flag);
		
		flag = !(num1>0);
		System.out.println(flag);
		//부정 단항 연산자. 참인 경우는 거짓으로 거짓은 참으로 변환
		
	}

}
