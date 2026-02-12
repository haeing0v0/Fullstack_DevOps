package interface1;

public class CalcRun {
	public static void main(String[] args) {
		//Calc.PI2 = 100;
		
		Calc calc = new CalcChild();
		calc.method1();
		calc.method2();
	}
}
