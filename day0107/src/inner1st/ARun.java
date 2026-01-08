package inner1st;

public class ARun {
	public static void main(String[] args) {
		
		A a = new A(); //A 클래스 사용
		a.method(); //D 클래스 사용
		
		A.B b = a.new B(); //B 클래스 사용
		b.method1();
		
		A.C c = new A.C();
		c.method1();
	}
}
