package ch12;

public class LogicalTest {

	public static void main(String[] args) {
		
		int num1=10;
		int num2=20;
		
		boolean flag = (num1>0) && (num2>0);
		System.out.println(flag);
		
		flag = (num1<0) && (num2<0);
		System.out.println(flag);
		//&&(논리곱)은 두 항의 결과가 모두 true일때만 결과가 true
		
		flag = (num1>0) || (num2>0);
		System.out.println(flag);
		//||(논리합)은 두 항의 결과가 모두 false일때만 결과가 false
		
		flag = (num1<0) || (num2<0);
		System.out.println(flag);
		
		flag = !(num1>0);
		System.out.println(flag);
		
		
	}

}
