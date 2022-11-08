package ch21;
/*break문
 * 감싸고 있는 제어문의 블록 빠져나오기(switch문도 가능)
 * 조건문(if)와 같이 사용하여 조건에 해당되는 경우, 반복 수행 멈추고 반복문 외부로 수행
 * 여러 반복문이 중첩시엔 break문이 포함되어 있는 반복문을 빠져나온다. 
 */
public class BreakTest {

	public static void main(String[] args) {
		
		int sum=0;
		int num;
		for(num=1; ;num++) {
			
			sum+=num;
			if(sum>=100)break;
		}
		System.out.println(sum);
		System.out.println(num);
	}

}
