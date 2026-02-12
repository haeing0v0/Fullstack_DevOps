package exam;

import java.util.Scanner;

public class Exam01 {
	//아래 출력예와 같이 사용자로부터 정수값 2개를 입력받아 덧셈, 뺄셈, 곱셈, 나눗셈 연산을 하여
	//출력하는 프로그램을 작성하시오. (20점)
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("2개의 정수 값을 입력하세요 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int sum = num1 + num2;
		int sub = num1 - num2;
		int mul = num1 * num2;
		int div = num1 / num2;
		
		System.out.println("덧셈 : " + sum);
		System.out.println("뺄셈 : " + sub);
		System.out.println("곱셈 : " + mul);
		System.out.println("나눗셈 : " + div);
		
		sc.close();
	}
}
