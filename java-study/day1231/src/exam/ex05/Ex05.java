package exam.ex05;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
//		문제5. 사용자로부터 정수값 2개를 입력받아서 덧셈, 뺄셈, 곱셈, 나눗셈 연산을 하여
//		출력하는 자바프로그램을 작성하시오. 단, 메소드를 사용하여 풀이하시오.
//		- 출력예 -
//		2개의 값을 입력하세요 : 5 2
//		덧셈 : 7
//		뺄셈 : 3
//		곱셈 : 10
//		나눗셈 : 2
		
		Scanner sc = new Scanner(System.in);
		System.out.print("2개의 값을 입력하세요 : ");
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		Sum sum1 = new Sum();
		int sum = sum1.sum(n1, n2);
		
		Sub sub1 = new Sub();
		int sub = sub1.sub(n1, n2);
		
		Mul mul1 = new Mul();
		int mul = mul1.mul(n1, n2);
		
		Div div1 = new Div();
		double div = div1.div(n1, n2);
		
		System.out.println("덧셈 : " + sum);
		System.out.println("뺄셈 : " + sub);
		System.out.println("곱셈 : " + mul);
		System.out.println("나눗셈 : " + div);
	}
}
