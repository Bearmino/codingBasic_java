package ch17;

public class EmployeeTest {

	public static void main(String[] args) {
		
		System.out.println(Employee.getSerialNum());
		// 클래스 이름으로 호출 가능(클래스 메서드.정적 메서드)
		
		Employee minsikOh = new Employee();
		minsikOh.setEmployeeName("오민식");
		
		Employee dongsukShin = new Employee();
		dongsukShin.setEmployeeName("신동석");
		
		System.out.println(minsikOh.getEmployeeName()+","+minsikOh.getEmployeeId());
		System.out.println(dongsukShin.getEmployeeName()+","+dongsukShin.getEmployeeId());
		
		System.out.println(Employee.serialNum);
		
	}

}
