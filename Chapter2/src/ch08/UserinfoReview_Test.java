package ch08;

public class UserinfoReview_Test {
	
	public static void main (String[]args) {
		
		UserinfoReview user1 = new UserinfoReview(180, 78, "Tommy", 37, "남성");
			
			String userData = user1.UserinfoShow();
			System.out.println(userData);
			
		UserinfoReview user2 = new UserinfoReview(150, 55, "Alice", 11,"여성");
			
			System.out.println(user2.UserinfoShow());
	}

}
