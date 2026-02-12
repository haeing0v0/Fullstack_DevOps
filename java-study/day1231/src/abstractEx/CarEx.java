package abstractEx;

public class CarEx {

	public static void main(String[] args) {
		
		System.out.println("========택시=========");
		//Car car = new Car(); 추상클래스는 객체생성 못함
		Car car = new Taxi();
		car.run();
	}

}
