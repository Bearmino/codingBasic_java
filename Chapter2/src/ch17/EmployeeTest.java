package ch17;

public class EmployeeTest {

	public static void main(String[] args) {
		
		System.out.println(Employee.serialNum); //생성자를 통한 인스턴스를 많이 사용한다.

		Employee employeeShin = new Employee();
		employeeShin.setEmployeeName("신동석");
				
		Employee employeeOh = new Employee();
		employeeOh.setEmployeeName("오민식");
		
		System.out.println(employeeShin.getEmployeeName()+"님의 사번은 "+employeeShin.getEmployeeId());
		System.out.println(employeeOh.getEmployeeName()+"님의 사번은 "+employeeOh.getEmployeeId());
		
	}

}
