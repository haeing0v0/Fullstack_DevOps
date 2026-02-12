package exam;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
//		문제2. 아래와 같이 2개의 정수를 입력 받아 출력하는 자바프로그램을 작성하여 보시오.
//		- 출력예 -
//		두 정수를 입력하세요 : 10 3
//		나눗셈 연산식은 10 / 3 = 3.333입니다.

		Scanner sc = new Scanner(System.in);
		
		System.out.print("두 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		double result = (double)num1 / num2;
		
		System.out.printf("나눗셈 연산식은 %d / %d = %.3f입니다.", num1, num2, result);
		
		sc.close();
	}

}
