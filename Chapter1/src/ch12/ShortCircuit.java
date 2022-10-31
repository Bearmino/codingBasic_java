package ch12;

public class ShortCircuit {

	public static void main(String[] args) {
		
		int num1=10;
		int i=2;
		
		boolean value = ((num1=num1+10) < 10)  && ((i=i+2)<10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		//&&(논리곱)은 두 항의 결과가 모두 true일때만 결과가 true
		
		
		value = ((num1=num1+10)<10) || ((i=i+2)<10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		//||(논리합)은 두 항의 결과가 모두 false일때만 결과가 false
		
	}

}
