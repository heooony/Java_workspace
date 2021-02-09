package driver_example;

public class Driver {
	public void drive(Vehicle vehicle) {
//		객체 타입 확인 부분
//		if(vehicle instanceof Bus) {
//			Bus bus = (Bus) vehicle;
//			bus.checkFare();
//		}
		vehicle.run();
	}
}
