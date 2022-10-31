package ch15;

import java.util.Scanner;

public class IfElseIfElseTest {

	public static void main(String[] args) {
		
		int age=12;
		int charge;
		
//		Scanner scanner = new Scanner(System.in);
//		int age = scanner.nextInt();
//		System.out.println("당신은 몇 살입니까?");
		
		if(age<8) {
			charge = 1000;
			System.out.println("미 취학 아동입니다.");
		}else if(age < 14) {
			charge = 2000;
			System.out.println("초등학생 입니다.");
		}else if(age < 20) {
			charge = 2500;
			System.out.println("중,고등학생 입니다.");
		}else {
			charge = 3000;
			System.out.println("일반인 입니다.");
		}
		System.out.println("입장료는"+charge + "원 입니다.");
	}
}
