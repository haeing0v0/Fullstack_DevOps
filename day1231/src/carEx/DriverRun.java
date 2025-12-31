package carEx;

public class DriverRun {

	public static void main(String[] args) {
		
		Driver driver = new Driver();
		Bus bus = new Bus();
		
		driver.drive(new Taxi());
		driver.drive(bus);
		driver.drive(new Sedan());
	}
}
