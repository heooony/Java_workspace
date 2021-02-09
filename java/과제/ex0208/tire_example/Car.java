package tire_example;

public class Car {
	Tire frontLeftTire = new HankookTire();
	Tire frontRightTire = new HankookTire();
	Tire backLeftTire = new HankookTire();
	Tire backRightTire = new HankookTire();
	
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}

//	필드 다형성챕터 실행 부분
//	Tire[] tires = {
//		new HankookTire(),
//		new HankookTire(),
//		new HankookTire(),
//		new HankookTire(),
//	};
//	
//	void run() {
//		for(Tire tire : tires) {
//			tire.roll();
//		}
//	}
}
