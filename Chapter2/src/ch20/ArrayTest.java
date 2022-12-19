package ch20;

/*
 *배열이란
 * 동일한 자료를 순차적 자료 구조
 * 인덱스 연산자[]를 이용하여 빠른 참조 가능 
 * 물리적 위치와 논리적 위치가 동일
 * 배열의 순서는 0부터 시작
 * 자바에선 객체 배열을 구현한 ArrayList가 많이 활용됨
 *
 */

public class ArrayTest {

	public static void main(String[] args) {
		
		//배열 선언
		int[] arr1 = new int[10];
		int arr2[] = new int[10];
		
		//배열 초기화
		// 배열은 선언과 동시에 자료형에 따라 초기화 됨(필요에 따라 초기값을 지정할 수 있음)
		int[] numbers = new int[] {10,20,30};	// 개수 생략해야 함
		int[] numbers2 = {10,20,30};	// new int[] 생략 가능
		int[] ids;
		ids = new int[] {10,20,30}; // 선언 후 배열을 생성하는 경우, new int[]를 생략할 수 없음
		
		
		//배열 사용하기
		//  []인덱스 연산자 활용 - 배열 요소가 저장된 메모리
		int[] arr = new int[10];
		int total = 0;
		
		for(int i=0,num=1; i < arr.length; i++, num++) {
			arr[i]=num;
		}
		
		for(int i=0; i<arr.length; i++) {
			total += arr[i];	
		}
		System.out.println(total);
		
		//배열의 길이와 요소의 개수는 동일하지 않다.
		// 배열을 선언하면 개수만큼 메모리가 할당 되지만, 실제요소(DATA)가 없는 경우도 있음
		// 배열의 length속성은 배열의 개수를 반환해주기 때문에 요소의 개수와는 다름
		
		// length를 활용한 오류가 나느 경우
		double[] darr = new double[5];
		
		darr[0]=1.1;
		darr[1]=2.1;
		darr[2]=3.1;
		
		double mtotal = 1;
		for(int i=0; i<darr.length; i++) {
			mtotal *= darr[i];
		}	
		System.out.println(mtotal);
		
		//요소의 갯수에 대한 변수(count)를 따로 유지시
		double[] carr = new double[5];
		int count=0;
		
		carr[0]=1.1; count++;
		carr[1]=2.1; count++;
		carr[2]=3.1; count++;
		
		double ctotal=1;
		for(int i=0; i<count; i++) {
				ctotal*=carr[i];
		}
	
		System.out.println(ctotal);
			
		
	}

}
