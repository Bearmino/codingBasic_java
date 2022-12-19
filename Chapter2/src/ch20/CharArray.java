package ch20;

public class CharArray {

	public static void main(String[] args) {
		
		//문자 배열을 만들어 A~Z까지 배열에 저장하고 이를 다시 출력하기
		
		char[] alphabets = new char[26];
		char ch = 'A';
		
		for(int i=0; i<alphabets.length; i++) {
				alphabets[i]=ch++;
		}
		
		for(int i=0; i<alphabets.length; i++) {
				System.out.println(alphabets[i]+","+(int)alphabets[i]);
		}
		
		//향상된 for문 사용
		// for(변수 : 배열){
		//	}
		
		char[] alphabets1 = new char[26];
		char ch1 = 'A';
		
		for(int i=0; i<alphabets1.length; i++) {
			alphabets1[i]=ch++;
		}
		
		for(char alpha : alphabets1) {
			System.out.println(alpha+","+(int)alpha);
		}
		
		
	}

}
