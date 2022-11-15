package ch07;

/*
 * 여러가지 생성자를 정의하는 생성자 오버로딩(Overloading)
 * 
 * 생성자를 구현해서 사용
 * 클래스에 생성자를 구현하면 기본 생성자는 제공되지 않음
 * 생성자를 호출하는 코드(client 코드)에서 여러 생성자 중 필요에 따라 호출해서 사용함
 * 
 */

public class UserInfo {
	
	public String userId;
	public String userPassWord;
	public String userName;
	public String userAddress;
	public String phoneNumber;
	
	public UserInfo(){}
	
	public UserInfo(String userId,String userPassWord, String userName, String userAddresss, String phoneNumber){
		this.userId = userId;
		this.userPassWord = userPassWord;
		this.userName = userName;
		this.userAddress = userAddress;
			
	}
	
	public String showUserInfo() {
		return "고객님의 아이디는" + userId +"이고, 등록된 이름은 "+userName+"입니다. ";
	}
	
}

