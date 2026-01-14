package anony;

public class Anonymous {

	Vehicle field = new Vehicle() {
		
		@Override
		public void run() {
			Driver driver = new Driver();
			driver.drive(new Taxi());
		}
	};
	
	void method1() {
		Vehicle localVal = new Vehicle() {
			
			@Override
			public void run() {
				Driver driver = new Driver();
				driver.drive(new Bus());
			}
		};
		localVal.run();
	}
	
	void method2(Vehicle vehicle) {
		
		vehicle.run();
	}
}
