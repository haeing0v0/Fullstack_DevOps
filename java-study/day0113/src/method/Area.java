package method;

public class Area {

	final double PI = 3.14;
	
	//메서드 작성 : double circumferenceCircle(double r), double AreaCircle(double r) 
	double circumferenceCircle(double r) { //원의 둘레
		return 2 * PI * r;
	}
	
	double areaCircle(double r) { //원의 면적
		return PI * r * r;
	}
}
