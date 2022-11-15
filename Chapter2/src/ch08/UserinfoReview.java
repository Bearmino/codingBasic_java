package ch08;

public class UserinfoReview {

	public int userInfoLength;
	public int userInfoWeight;
	public String userName;
	public int userAge;
	public String userSex;
	
	
	public UserinfoReview(int userInfoLength,int userInfoWeight, String userName, int userAge, String userSex ) {
		this.userInfoLength=userInfoLength;
		this.userInfoWeight=userInfoWeight;
		this.userName=userName;
		this.userAge=userAge;
		this.userSex=userSex;
	}
	
	public String UserinfoShow() {
		return "키가" +userInfoLength+"이고"+" 몸무게가 "+userInfoWeight+"킬로인 "+userSex+"이 있습니다."+" 이름은 "+userName+"이고,나이는 "+userAge+"입니다.";
				
	}
	
}
