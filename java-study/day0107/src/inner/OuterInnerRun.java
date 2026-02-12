package inner;

public class OuterInnerRun {
	public static void main(String[] args) {
		
		Outer outer = new Outer(); //바깥쪽 클래스 객체 생성
		Outer.Inner outIn = outer.new Inner();
		//바깥쪽 클래스타입.안쪽 클래스타입 변수명 = 바깥쪽 인스턴스명.new 안쪽 클래스 생성자();
		
		outIn.innerField = 10;
		outIn.innerMethod();
	}
}
