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
	/* 다중 if문
	 * if(조건식1){
	 * 	수행문1; 조건이 1이 '참'인 경우 수행하고, 전체 조건문 빠져 나가기
	 * }else if(조건시2){
	 *  수행문2; 조건이 2이 '참'인 경우 수행하고, 전체 조건문 빠져 나가기
	 * }
	 *수행문 3; 다중 if문이 끝나면 수행됨
	 *
	 */
	
}
