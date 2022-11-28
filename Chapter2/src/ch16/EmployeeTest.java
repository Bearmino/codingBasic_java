package ch16;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee employeeShin = new Employee();
		employeeShin.setEmployeeName("신동석");
		System.out.println(employeeShin.serialNum);
		
		
		Employee employeeOh = new Employee();
		employeeOh.setEmployeeName("오민식");
		employeeOh.serialNum++;
		
		System.out.println(employeeOh.serialNum);
		System.out.println(employeeShin.serialNum);
		
	}

}
