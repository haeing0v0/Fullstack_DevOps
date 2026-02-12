package exam.ex07;

public class Result {
	
	int sum(int n1, int n2, int n3) {
		return n1 + n2 + n3;
	}
	
	double avg(int n1) {
		return (double)n1 / 3;
	}
	
	void menu() {
		System.out.println("============== 메뉴 ==============");
		System.out.println("(1) 총점계산 (2) 평균계산 (3) 합격여부");
	}
}
