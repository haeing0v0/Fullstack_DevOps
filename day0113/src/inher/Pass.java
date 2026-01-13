package inher;

public class Pass extends Avg {

	//메서드 작성 : void result(int x, int y, int z, double avg)
	void result(int x, int y, int z, double avg) {
		if (x < 40 || y < 40 || z < 40 || avg < 60) {
			System.out.println("불합격입니다.");
		} else {
			System.out.println("합격입니다.");
		}
	}
}
