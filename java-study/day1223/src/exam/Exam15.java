package exam;

public class Exam15 {

	public static void main(String[] args) {
		
//		문제15. 반복문을 사용하여 1부터 10까지 짝수의 곱을 출력하는 자바프로그램을 작성하여 보시오.
//		- 출력예 -
//		1부터 10까지 짝수의 곱은 3840입니다.
		
		int mul = 1;

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				mul *= i;
			}
		}
		System.out.println("1부터 10까지 짝수의 곱은 " + mul + "입니다.");
	}
}
