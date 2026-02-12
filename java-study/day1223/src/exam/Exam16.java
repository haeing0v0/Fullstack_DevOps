package exam;

public class Exam16 {

	public static void main(String[] args) {
		
//		문제16. 반복문을 사용하여 아래 출력예와 같이 자바프로그램을 작성하여 보시오.
//		- 출력예 -
//		1부터 10까지의 홀수의 곱은 945입니다.
		
		int mul = 1;

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1) {
				mul *= i;
			}
		}
		System.out.println("1부터 10까지 홀수의 곱은 " + mul + "입니다.");

	}

}
