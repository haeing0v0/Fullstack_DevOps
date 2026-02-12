package superimposition;

public class ARun {
	public static void main(String[] args) {
		
		A a = new A();
		
		A.B b = a.new B();
		b.field1 = 3;
		b.method1();
		//A.B.field2 = 3;
		//A.B.method2();
		
		A.C c = new A.C(); //static
		c.field1 = 3;
		A.C.field2 = 3;
		c.method1();
		A.C.field2 = 3;
		
		a.method();
	}
}