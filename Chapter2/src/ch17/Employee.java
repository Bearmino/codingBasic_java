package ch17;

public class Employee {

	private static int serialNum = 1000;
	
	private int employeeId;
	private String employeeName; // 인스턴스 변수
	private String department;
	
	
	public Employee() {
		serialNum++;
		employeeId = serialNum;
	}
	
	
	public static int getSerialNum() {
		return serialNum;
	}
	public static void setSerialNum(int serialNum) {
		int i=0; // i는 함수 내부의 지역변수이다.
		
		//	employeeName="Lee"; //오류발생, 인스턴스 생성전 호출 될 수 있으므로 static메서드 내부에서는 인스턴수 변수를 사용할 수 없다.(메모리가 존재하지 않은 상태)
		Employee.serialNum = serialNum; // static 메서드는 인스턴스 생성과 무관하게 클래스 이름으로 호출 될 수 있음 (메모리가 존재)
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
}
