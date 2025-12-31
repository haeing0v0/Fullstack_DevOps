package inherit;

public class ChildRun {

	public static void main(String[] args) {
	
		Child child = new Child();
		
		Parent parent = child; //자동 형변환
		parent.method1();
		parent.method2(); //자식 호출됨
		//parent.method3(); 자식 메서드는 사용 불가능
	}
}
