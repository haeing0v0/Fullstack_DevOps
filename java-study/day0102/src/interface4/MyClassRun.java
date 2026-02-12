package interface4;

public class MyClassRun {

	public static void main(String[] args) {
		
		MyClass mc = new MyClass();
		mc.x();
		mc.y();
		mc.method();
		
		System.out.println("==========================");
		
		//MyInterface mInter = new MyClass(); 아래 코드와 동일
		MyInterface mInter = mc;
		mInter.x();
		mInter.y();
		mInter.method();
	}
}
