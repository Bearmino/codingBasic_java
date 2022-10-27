package ch08;

public class CharacterTest {

	public static void main(String[] args) {
		
		char ch1='A';
		System.out.println(ch1);
		System.out.println((int)ch1);
		
		char ch2=66;
		System.out.println(ch2);
		
		int ch3=67;
		System.out.println(ch3);
		System.out.println((char)ch3);
		
		//char ch4 = -66; 음수는 적용할 수 없음
		
		char ch5='한';
		char ch6='\uD55c';
		
		System.out.println(ch5);
		System.out.println(ch6);
		
		/*
		 * character set : 문자를 숫자로 변환한 값의 세트
		 * encoding : 문자가 숫자로 변환되는 것
		 * decoding : 수자에서 다시 문자로 변환되는 것
		 * ASKⅡ code : 알파벳과 숫자 특수 문자등을 1바이트에 표현하는데 사용하는 문자세트
		 * UNICODE : 전 세계 표준으로 만든 문자 세트
		 * UTF-8 : 1바이트에서 4바이트까지 다양하게 문자를 표현할 수 있음(8~32bit)
		 * UTF-16 : 2바티으로 문자를 표현(16bit)
		 */
		
	}

}
