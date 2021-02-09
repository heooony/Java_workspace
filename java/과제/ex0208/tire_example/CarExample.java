package tire_example;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.run();
		
		myCar.frontLeftTire = new KumhoTire();
		myCar.frontRightTire = new KumhoTire();

//		필드 다형성챕터 실행 부분
//		myCar.tires[0] = new KumhoTire();
//		myCar.tires[1] = new KumhoTire();
		
		myCar.run();
	}
}
