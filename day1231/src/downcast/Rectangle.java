package downcast;

public class Rectangle extends Shape {
	
	@Override
	void draw() {
		System.out.println("사각형을 그린다.");
	}
	
	void rectangle() {
		System.out.println("사각형 입니다.");
	}
}
