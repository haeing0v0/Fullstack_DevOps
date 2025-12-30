package exam;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
//		문제6. 정수 세 개의 곱을 구하여 출력하는 자바프로그램을 작성하여 보시오.
//		- 출력예 -
//		세 개의 정수를 입력하세요 : 2 30 40
//		정수 2, 30, 40의 곱은 2400입니다.

		Scanner sc = new Scanner(System.in);
		
		System.out.print("세 개의 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int result = num1 * num2 * num3;
		
		System.out.println("정수 " + num1 + ", " + num2 + ", " + num3 + "의 곱은 " + 
		result + "입니다.");
		
		sc.close();
	}

}
