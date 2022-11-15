package ch08;

public class OrderReview_Test {

	public static void main(String[] args) {
			
		OrderReview order1 = new OrderReview();
		order1.orderId = 20201102003L;
		order1.orderPhone = 01023450001;
		order1.orderAddress = "서울시 강남구 역삼동 111-333";
		order1.orderDate = 20201102;
		order1.orderTime = 130258;
		order1.orderPrice = 35000;
		order1.menuNumber = 003;
		
		order1.orderShowInfo();
	}

}
