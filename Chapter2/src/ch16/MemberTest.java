package ch16;

public class MemberTest {

	public static void main(String[] args) {
		
		System.out.println(Member.serialNum); //생성자를 통한 인스턴스를 많이 사용한다.

		Member employeeShin = new Member();
		employeeShin.setEmployeeName("신동석");
				
		Member employeeOh = new Member();
		employeeOh.setEmployeeName("오민식");
		
		System.out.println(employeeShin.getEmployeeName()+"님의 사번은 "+employeeShin.getEmployeeId());
		System.out.println(employeeOh.getEmployeeName()+"님의 사번은 "+employeeOh.getEmployeeId());
		
	}

}
