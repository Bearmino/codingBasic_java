package ch10;

public class typeConversion {

	public static void main(String[] args) {
		
		double dNum=123;
		float fNum=0.9F;
		
		int iNum1 = (int)dNum+(int)fNum;
		int iNum2 = (int)(dNum+fNum);
		
		System.out.println(iNum1);
		System.out.println(iNum2);
	}

}
