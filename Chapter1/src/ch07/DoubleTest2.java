package ch07;

public class DoubleTest2 {

	public static void main(String[] args) {
		
		double dnum=1;
		
		for(int i=0; i<10000; i++) {
			dnum = dnum + 0.1;
		}
		System.out.println(dnum);
		//지수와 가수로 나타내는 부동 소수점 방식에는 지수부가 0을 표현할 수 없기에, 약간의 오차가 발생한다.
	}
}
