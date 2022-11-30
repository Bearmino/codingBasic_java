package ch18;

/*
 *싱글톤 패턴
 * 프로그램에서 인스턴스가 단 한개만 생성되어야 하는 경우 사용하는 디자인 패턴
 * 
 */

public class Company {

	private static Company instance = new Company(); // 유일한 객체를 생성
	
	private Company() {
		
	}
	
	public static Company getInstance() {
		
		if(instance==null) {
			instance = new Company();
		}
		return instance;
	}
	
}
