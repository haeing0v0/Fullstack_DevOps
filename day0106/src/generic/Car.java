package generic;

public class Car extends Vehicle {

	public Car(String name) {
        super(name);
    }

    @Override
    public void addFuel(int f) {
        super.addFuel(f);
    }
}

class Taxi extends Car {
	public Taxi(String name) {
		super(name);
	}
}

class AutoCar extends Car{
	public AutoCar(String name) {
		super(name);
	}
}