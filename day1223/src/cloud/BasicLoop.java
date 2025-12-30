package cloud;

public class BasicLoop {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			System.out.print(i);
		}
		System.out.println();
		
		int num = 0;

		while (num < 5) {
			System.out.print(num);
			num++;
		}
		System.out.println();
		
		while (true) {
			System.out.print("1");
			break;
		}
		System.out.println();
		
		do {
			System.out.print("do 구문은 조건이 false여도 한번은 실행한다.");
		} while (false);
	}
}
