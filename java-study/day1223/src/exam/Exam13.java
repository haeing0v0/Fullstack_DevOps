package exam;

import java.util.Scanner;

public class Exam13 {

	public static void main(String[] args) {
		
//		문제13. 반복문을 사용하여 1부터 입력한 숫자까지의 합계를 구하는 자바프로그램을 작성하여 보시오.
//		- 출력예 -
//		정수를 입력하세요 : 50
//		1부터 50까지의 합계는 1275입니다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		
		System.out.println("1부터 " + num + "까지의 합계는 " + sum + "입니다.");
	}
}
