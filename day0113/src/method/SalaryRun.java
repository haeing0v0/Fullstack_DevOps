package method;

public class SalaryRun {
	public static void main(String[] args) {
		
		Salary sl = new Salary();
		
		int sum = sl.sum();
		double money = sl.tax(sum);
		
		System.out.println("A회사원의 실 입금액은 " + money + "만원입니다.");
	}
}