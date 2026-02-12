package abstractEx;

public class Taxi extends Car{
	
	@Override
	public void startCar() {
		System.out.println("택시에 시동을 겁니다.");
	}
	
	@Override
	public void drive() {
		System.out.println("택시를 운전합니다.");
	}

}
