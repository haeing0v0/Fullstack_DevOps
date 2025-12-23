package exam;

public class Exam12 {

	public static void main(String[] args) {
		
//		문제12. for 반복문을 사용하여 1부터 100까지의 합계를 구하여 출력하는 자바프로그램을 작성하여 보시오.
//		- 출력예 -
//		1부터 100까지의 합계는 5050입니다.
		
		int sum = 0;
		
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		
		System.out.println("1부터 100까지의 합계는 " + sum + "입니다.");
	}
}
