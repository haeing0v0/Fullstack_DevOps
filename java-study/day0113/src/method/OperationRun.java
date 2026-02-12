package method;

import java.util.Scanner;

public class OperationRun {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Operation op = new Operation();
		
		System.out.print("2개의 실수값을 입력하세요 : ");
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		
		System.out.println("덧셈 : " + op.sum(num1, num2));
		System.out.println("뺄셈 : " + op.sub(num1, num2));
		System.out.println("곱셈 : " + op.mul(num1, num2));
		System.out.println("나눗셈 : " + op.div(num1, num2));
	}
}