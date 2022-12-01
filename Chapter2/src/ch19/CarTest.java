package ch19;

public class CarTest {

	public static void main(String[] args) {
				
		CarFactory factory = CarFactory.getInstance();
		Car benz = factory.createCar();
		benz.setCarName("벤츠");
		
		Car volvo = factory.createCar();
		volvo.setCarName("볼보");
		
		System.out.println(benz.getCarName()+benz.getCarNumber());
		System.out.println(volvo.getCarName()+volvo.getCarNumber());
		
	}

}
