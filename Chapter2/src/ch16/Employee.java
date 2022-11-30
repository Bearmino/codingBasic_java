package ch16;

/*
 *static 변수
 * 여러 인스턴스가 공유하는 기준값이 필요한 경우 사용
 * 인스턴스가 생성될 떄 만들어지는 변수가 아닌, 처음 프로그램이 메모리에 로딩될 때 메모리에 할당
 */

public class Employee {
	
	public static int serialNum = 100;
	
	private int employeeId;
	private String employeeName;
	private String department;
	
	public Employee() {
		serialNum++;
		employeeId = serialNum;
	}

	public String getEmployeeName() {
		return employeeName;
	}
	
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}

}
