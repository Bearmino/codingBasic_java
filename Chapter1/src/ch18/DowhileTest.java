package ch18;

import java.util.Scanner;

/*
 * do-while문은 조건과 상관없이 수행을 한번하고 나서 조건을 체크한다.
 * 조건이 맞지 않으면 더이상 수행하지 않음
 */

public class DowhileTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int input;
		int sum=0;
		
		do {
			System.out.println("숫자를 입력하여 주세요.");
			input = scanner.nextInt();
			sum+=input;
		
		}while(input !=0);
		
		System.out.println(sum);
	}
}
