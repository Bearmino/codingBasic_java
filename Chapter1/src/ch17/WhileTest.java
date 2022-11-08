package ch17;
/*
 * 주어진 조건이 참(True)인 동안 지정된 수행문을 반복한다.
 * 조건이 맞지 않으면 반복하던 수행을 멈추게 됨
 * 조건은 주로 반복 횟수나 값의 비교의 결과에 따라 True,False 판단
 * 
 * */

public class WhileTest {

	public static void main(String[] args) {
		
		int num=1;
		int sum=0;
		
		while(num<=10) {
				sum+=num;
				num++;
		}
		System.out.println(sum);
		System.out.println(num);
		//1~10까지 더한 값이다.
	}

}
