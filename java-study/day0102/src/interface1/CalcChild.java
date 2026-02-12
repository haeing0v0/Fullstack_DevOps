package interface1;

public class CalcChild implements Calc {
	
	@Override
	public void method1() {
		System.out.println("CalcChild.method1() 실행");
	}
	
	@Override
	public void method2() {
		System.out.println("CalcChild.method2() 실행");
	}
}
