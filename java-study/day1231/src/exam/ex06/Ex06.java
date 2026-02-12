package exam.ex06;

import java.util.Scanner;

import exam.ex05.Div;
import exam.ex05.Mul;
import exam.ex05.Sub;
import exam.ex05.Sum;

public class Ex06 {

	public static void main(String[] args) {
//		문제6. 문제5에서 나머지를 출력하는 기능을 상속을 이용하여 자식클래스를 출력하는
//		자바프로그램을 작성하여 보시오.
//		2개의 값을 입력하세요 : 5 2
//		덧셈 : 7
//		뺄셈 : 3
//		곱셈 : 10
//		나눗셈 : 2
//		나머지 : 1
		
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
		
		Rem rem1 = new Rem();
		int rem = rem1.rem(n1, n2);
		
		System.out.println("덧셈 : " + sum);
		System.out.println("뺄셈 : " + sub);
		System.out.println("곱셈 : " + mul);
		System.out.println("나눗셈 : " + div);
		System.out.println("나머지 : " + rem);
	}
}
