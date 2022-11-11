package ch06;


public class StudentTest {

	public static void main(String[] args) {
		
		//Student studentLee = new Student();
		
		Student studentLee = new Student(154148, "이동경", 3);
		
		String data = studentLee.showStudentInfo();
		System.out.println(data);
		
	}

}
