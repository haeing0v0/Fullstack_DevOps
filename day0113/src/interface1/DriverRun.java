package interface1;

public class DriverRun {
	public static void main(String[] args) {
		//버스가 달린다. 택시가 달린다.
		Driver driver = new Driver();
		
		driver.drive(new Bus());
		driver.drive(new Taxi());
	}
}