package interface2;

public class CompleteCalc extends Calculator { //Calc > Calcurator >  CompleteCalc

	@Override
	public int add(int n1, int n2) {
		// TODO Auto-generated method stub
		return n1 + n2;
	}
	
	public void showInfo() {
		System.out.println("CompleteCalc.showInfo() 실행.");
	}
}
