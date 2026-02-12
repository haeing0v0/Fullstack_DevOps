package method;

public class Salary {
	
	int salary = 150;
	int bonus = 60;

	//메서드 작성 : int sum(), double tax(int sum)
	int sum() {
		return salary + bonus;
	}
	
	double tax(int sum) {
		return sum * 0.91;
	}
}
