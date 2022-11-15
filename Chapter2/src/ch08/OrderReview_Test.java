package ch08;

/*
 * 음식점에 배달 주문이 온 객체를 생성하시오.
 * 주문 접수 번호 : 202011020003
 * 주문 핸드폰 번호 : 01023450001 
 * 주문 집 주소 : 서울시 강남구 역삼동 111-333
 * 주문 날짜 : 20201102
 * 주문 시간 : 130258
 * 주문 가격 : 35000
 * 메뉴 번호 : 0003
 * 
 */

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
