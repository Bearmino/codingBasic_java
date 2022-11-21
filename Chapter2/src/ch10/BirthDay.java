package ch10;
/*
 * 접근 제어 지시자(access modifier)
 * 
 *  클래스 외부에서 클래스의 멤버 변수,메서드,생성자를 사용할 수 있는지 지정하는 키워드
 *  private : 같은 클래스 내부에서만 접근 가능(외부,상속 클래스 접근 불가)
 *  아무것도 없음(default) : 같은 패키지 내부에서만 접근 가능(상속이라도 패키지가 다르면 불가)
 *  protected: 같은 패키지나 상속관계의 클래스에서 접근 가능하고 그 외 외부에서는 접근 불가
 *  public : 클래스의 외부 어디서나 접근이 가능
 * 
 * get()/set()메서드
 * 	
 * 	private으로 선언된 멤버 변수(필드)에 대해 접근,수정할 수 있는 메서드를 public으로 제공
 *  get()메서드만 제공 되는 경우 read-only필드
 *  이클립스에서 자동으로 생성됨
 * 
 * 정보은닉 
 *  private으로 제어한 멤버 변수도 public메서드가 제공되면 접근이 가능하지만 pulbic으로 공개 되었을때본다 
 *  private일 때 각 변수에대한 제한을 public메서드에서 제어 할 수 있다.
 *  
 */
public class BirthDay {
		
	private int day;
	private int month;
	private int year;
	
	private boolean isValid; //valid :유효한, 타당한

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void showDate() {
		if(isValid) {
			System.out.println(year+"년 "+month+"월 "+day+"일 입니다.");
		}else {
			System.out.println("유효하지 않은 날짜입니다.");
		}
	}
}
