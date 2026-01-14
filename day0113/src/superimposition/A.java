package superimposition;

public class A {

	public A() {
		System.out.println("A 객체가 생성됨");
	}
	
	class B {
		public B() {
			System.out.println("B 객체가 생성됨");
		}
		
		int field1;
		void method1() {}
	}
	
	static class C {
		public C() {
			System.out.println("C 객체가 생성됨");
		}
		
		int field1;
		static int field2;
		
		void method1() {}
		static void method2() {}
	}
	
	void method() { //로컬 메소드
		class D {
			public D() {
				System.out.println("D 객체가 생성됨");
			}
			
			int field1;
			static int field2; //jdk 17 허용
			
			void method1() {}
			static void method2() {} //jdk 17 허용
		}
		
		D d = new D();
		d.field1 = 3;
		d.method1();
		D.field2 = 3; //jdk 17 허용
		D.method2(); //jdk 17 허용
	}
}

