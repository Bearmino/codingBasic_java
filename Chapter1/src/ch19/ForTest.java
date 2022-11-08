package ch19;
/*
 * 조건에 맞는 for문 반복작업
 * for(초기화식; 조건식; 증감식)
 * {
 * 			수행문;	
 * }
 *
 */
public class ForTest {

	public static void main(String[] args) {
		int count=1;
		int sum=0;
		
		for(int i=0; i<10; i++,count++) {
		//for문은 초기화식,조건식, 증감식 각 요소의 생략이 가능하다.
	    //i++은 i=i+1과 동일한 의미를 지닌다.
			
			sum+=count;
			//count++;
		}
		System.out.println(sum);
		
		int num=1;
		int total=0;
		
		while(num<=10) {
			total+=num;
			num++;
		}
		System.out.println(total);
	}

}

/*
 * while,do-while문의 경우에는 조건식의 결과나 변수가 True,False값인 경우 주로 사용
 * for문의 경우에는 특정수의 범위, 횟수와 관련하여 반복, 배열과 함께 많이 사용된다.
 *
 */
