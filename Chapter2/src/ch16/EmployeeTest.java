package ch16;

public class EmployeeTest {

	public static void main(String[] args) {
			
		Employee minsikOh = new Employee();
		minsikOh.setEmployeeName("오민식");
		
		Employee dongsukShin = new Employee();
		dongsukShin.setEmployeeName("신동석");
		
		System.out.println(minsikOh.getEmployeeName()+","+minsikOh.getEmployeeId());
		System.out.println(dongsukShin.getEmployeeName()+","+dongsukShin.getEmployeeId());
		
		System.out.println(Employee.serialNum);
	}

}
