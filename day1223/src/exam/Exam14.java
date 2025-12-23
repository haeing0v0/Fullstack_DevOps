package exam;

public class Exam14 {

	public static void main(String[] args) {
		
//		문제14. 반복문을 사용하여 아래 출력예와 같이 자바프로그램을 작성하여 보시오.
//		- 출력예 -
//		1부터 10까지의 홀수의 합은 25입니다.
		
		int sum = 0;

		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 1) {
				sum += i;
			}
		}
		System.out.println("1부터 10까지의 홀수의 합은 " + sum + "입니다.");
	}
}
