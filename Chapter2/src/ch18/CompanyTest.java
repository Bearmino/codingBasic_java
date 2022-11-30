package ch18;

import java.util.Calendar;

public class CompanyTest {

	public static void main(String[] args) {
			
		Company company1 = Company.getInstance();
		Company company2 = Company.getInstance();
		
		System.out.println(company1);
		System.out.println(company2);		
		// 동일한 메모리 값
		
		Calendar calendar = Calendar.getInstance();
	}

}
