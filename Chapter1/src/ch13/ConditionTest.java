package ch13;

import java.util.Scanner;

public class ConditionTest {

	public static void main(String[] args) {
		
		int max;
		System.out.println("입력 받은 두 수중에 큰 수를 출력하시오");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("입력1 :");
		int x = scanner.nextInt();
		System.out.println("입력2 : ");
		int y = scanner.nextInt();
		
		max=(x>y)?x : y;
		System.out.println("두 수중에 큰수는: " + max +"입니다.");
		//삼항연산자ㅁ
		//조건식? 결과1 : 결과2;
		//조건식이 참이면 결과1, 거짓이면 결과2;
		
	}

}
