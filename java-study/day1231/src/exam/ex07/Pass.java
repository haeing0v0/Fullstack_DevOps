package exam.ex07;

public class Pass extends Result {
	void result(int n1, int n2, int n3, double avg) {
		if (n1 < 40 || n2 < 40 || n3 < 40 || avg < 60) {
			System.out.println("불합격입니다.");
		} else {
			System.out.println("합격입니다.");
		}
	}
}
