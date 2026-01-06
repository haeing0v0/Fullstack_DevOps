package generic;

public class FactoryRun {
	public static void main(String[] args) {

		CarFactory<Car> carFactory = new CarFactory<Car>();
		AutoCar car = new AutoCar("홍카");
		carFactory.fixCar(car);
		
		ShipFactory<Ship> shipFactory = new ShipFactory<Ship>();
		Cruze cruze = new Cruze("톰크루즈");
		shipFactory.fixShip(cruze);
	}
}
