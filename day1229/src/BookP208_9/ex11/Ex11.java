package BookP208_9.ex11;

public class Ex11 {
	//자동차 공장이 있습니다. 자동차 공장은 유일한 객체이고,
	//이 공장에서 생산하는 자동차는 제작될 때마다 고유 번호가 부여됩니다.
	//자동차 번호는 10001부터 시작하고 자동차가 생성될 때마다 1씩 증가해 10002, 10003 이렇게
	//고유 번호가 붙도록 자동차 공장 클래스와 자동차 클래스를 만들어보세요.
	
	public static void main(String[] args) {
		CarFactory factory = CarFactory.getInstance();
		Car granger1 = factory.createCar();
		Car granger2 = factory.createCar();
		
		System.out.println(granger1.getCarNum());
		System.out.println(granger2.getCarNum());
	}
}
