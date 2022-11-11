package ch07;

/*
 * 여러가지 생성자를 정의하는 생성자 오버로딩(Overloading)
 * 
 * 생성자를 구현해서 사용
 * 클래스에 생성자를 구현하면 기본 생성자는 제공되지 않음
 * 생성자를 호출하는 코드에서 여러 생성자 중 필요에 따라 호출해서 사용함
 * 
 */

public class UserInfoTest {

	public static void main(String[] args) {
		
		UserInfo userLee = new UserInfo();
		userLee.userName = "이동경";
		userLee.userId = "a723123";
		userLee.userPassWord = "zxurur22";
		userLee.phoneNumber = "01042582939";
		userLee.userAddress="seong-nam";
		
		System.out.println(userLee.showUserInfo());
		
		UserInfo userKim = new UserInfo("324245", "cmduye77", "김창현", "gwang-ju", "0104237299");
		System.out.println(userKim.showUserInfo());
		
	}

}
