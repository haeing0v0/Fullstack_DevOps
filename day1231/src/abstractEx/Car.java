package abstractEx;

public abstract class Car { //추상 클래스는 일반메서드, 추상메서드를 멤버로 가질 수 없다.

	public abstract void drive(); //추상메서드
	
	public void startCar() {
		System.out.println("차에 시동을 겁니다.");
	}
	
	final public void run() {
		startCar();
		drive();
	}
}
