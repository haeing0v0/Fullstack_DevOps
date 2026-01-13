package inher;

import java.util.Scanner;

public class RemainderRun {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Remainder r = new Remainder();
		
		System.out.print("2개의 정수 값을 입력하세요 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println("덧셈 : " + r.sum(num1, num2));
		System.out.println("뺄셈 : " + r.sub(num1, num2));
		System.out.println("곱셈 : " + r.mul(num1, num2));
		System.out.println("나눗셈 : " + r.div(num1, num2));
		System.out.println("나머지 : " + r.rem(num1, num2));
	}
}