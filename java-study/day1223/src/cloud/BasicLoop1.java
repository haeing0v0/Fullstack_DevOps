package cloud;

public class BasicLoop1 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for (int i = 0; i < 10; i++) {
			sum += i + 1;
			System.out.print(", "+ sum);
		}
		
		System.out.println();
		System.out.println("1~10까지의 합은 " + sum + "입니다.");

	}
}
