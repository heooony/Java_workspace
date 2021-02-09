package driver_example;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);
		driver.drive(taxi);
		
		Vehicle vehicle = new Bus();
		
//		강제타입변환 확인 부분
//		vehicle.run();
//		//vehicle.checkFare();
//		
//		Bus bus = (Bus) vehicle;
//		bus.run();
//		bus.checkFare();
	}
}
