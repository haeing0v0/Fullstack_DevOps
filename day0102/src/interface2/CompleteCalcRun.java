package interface2;

public class CompleteCalcRun {

	public static void main(String[] args) {
		
		int n1 = 1, n2 = 20;
		
		CompleteCalc calc1 = new CompleteCalc();
		Calc calc2 = new CompleteCalc();
		Calculator calc3 = new CompleteCalc();
		
		int add1 = calc1.add(n1, n2); //CompleteCalc 타입
		int add2 = calc2.add(n1, n2); //Calc 타입
		int add3 = calc3.add(n1, n2); //Calculator 타입
		
		calc1.showInfo(); //CompleteCalc.showInfo() 사용
		calc3.showInfo(); //Calculator.showInfo() 사용

	}
}
