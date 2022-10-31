package ch13;

public class BitTest {

	public static void main(String[] args) {
		
		int num1=5; // 00000101
		int num2=10; //00001010
		
		System.out.println(num1 | num2);
		//비트단위 OR 0|0 반환 그외는 1
		System.out.println(num1 & num2);
		//비트단위 AND 1&1 반환 그외는 0
		System.out.println(num1 ^ num2);
		//비트단위 XOR 둬개의 비트가 서로 다른 경우에 1을 반환
		System.out.println(~num1);
		//비트의 반전(1의 보수)
		System.out.println(num1 << 2);
		//왼쪽 shift num1<<2 변수를 num1을 2비트만큼 왼쪽으로 이동
		System.out.println(num1);
		System.out.println(num1 <<= 2);
		//왼쪽 shift num1 
		System.out.println(num1);
		
	}

}
