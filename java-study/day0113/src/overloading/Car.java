package overloading;

public class Car {

	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;

	public Car() {
		
	}
	
	//model 매개변수 생성자
	public Car(String model) {
		this.model = model;
	}	
	
	//model, color 매개변수 생성자
	public Car(String model, String color) {
		this.model = model;
		this.color = color;
	}
		
	//model, color, maxSpeed 매개변수 생성자
	public Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

}
