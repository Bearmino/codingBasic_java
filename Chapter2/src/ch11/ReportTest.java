package ch11;

public class ReportTest {

	public static void main(String[] args) {
		
		MakeReport report = new MakeReport();
		String builder = report.getReport();
		
		System.out.println(builder);
	}

}
