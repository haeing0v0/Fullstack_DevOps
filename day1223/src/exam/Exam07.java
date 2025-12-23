package exam;

import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {
		
//		문제7. 2개의 정수를 입력받아 해당하는 번호를 선택하면 사칙연산을 하는 자바프로그램을 작성하여 보시오.
//		(if~else if~else 또는 switch~case 중 선택)
//		- 출력예 -
//		2개의 정수를 입력하세요 : 20 30
//		사칙연산을 선택하세요. (1) 덧셈 (2) 뺄셈 (3) 곱셈 (4) 나눗셈 (5) 종료
//		1
//		입력하신 정수의 덧셈은 50입니다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("2개의 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println("사칙연산을 선택하세요. (1) 덧셈 (2) 뺄셈 (3) 곱셈 (4) 나눗셈 (5) 종료");
		int select = sc.nextInt();
		
		int sum, min, mul, div = 0;
		
		if (select == 1)  {
			sum = num1 + num2;
			System.out.println("입력하신 정수의 덧셈은 " + sum + "입니다.");
		} else if (select == 2) {
			min = num1 - num2;
			System.out.println("입력하신 정수의 뺄셈은 " + min + "입니다.");
		} else if (select == 3) {
			mul = num1 * num2;
			System.out.println("입력하신 정수의 곱셈은 " + mul + "입니다.");
		} else if (select == 4) {
			mul = num1 / num2;
			System.out.println("입력하신 정수의 나눗셈은 " + div + "입니다.");
		} else if (select == 5) {
			System.out.println("프로그램을 종료합니다.");
		} else
			System.out.println("잘못 입력했습니다. 다시 시작해주세요");
		
		sc.close();
	}
}
