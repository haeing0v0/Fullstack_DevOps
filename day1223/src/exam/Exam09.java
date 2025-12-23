package exam;

import java.util.Scanner;

public class Exam09 {
	public static void main(String[] args) {
		
//		문제9. switch문을 사용하여 사용자로부터 하나의 문자를 입력받아서 문자가 'R' 또는 'r'이면 사각형의 면적을 계산하고
//		'C' 또는 'c'이면 원의 면적을 'T' 또는 't'는 삼각형의 면적을 계산하여 출력하는 자바프로그램을 작성하여 보시오.
//		단, 원주율은 3.141592를 사용하며 상수 처리하시오.
//		- 출력예 -
//		사각형(R), 원(C), 삼각형(T) 중 하나를 선택하세요 : T(C/R)
//		밑변의 길이(반지름/가로 길이)를 입력하세요 : 10 
//		높이(세로 길이)를 입력하세요 : 10
//		구하고자 하는 삼각형(원/사각형)의 면적은 50.00(314.16/100)입니다.
		
		final double pi = 3.141592;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("사각형(R), 원(C), 삼각형(T) 중 하나를 선택하세요 : ");
		String select = sc.nextLine();
		
		double result = 0;
		
		if(select.equals("R") || select.equals("사각형")) {
			System.out.print("가로 길이를 입력하세요 : ");
			int a = sc.nextInt();
			
			System.out.print("세로 길이를 입력하세요 : ");
			int b = sc.nextInt();
			
			result = a * b;
			
			System.out.print("구하고자 하는 사각형의 면적은 " + result + "입니다.");
		} 
		
		else if (select.equals("C") || select.equals("원")) {
			System.out.print("반지름 길이를 입력하세요 : ");
			int r = sc.nextInt();
			
			result = r * r * pi;
			
			System.out.print("구하고자 하는 원의 면적은 " + result + "입니다.");
		} 
		
		else if (select.equals("T") || select.equals("삼각형")) {
			System.out.print("밑변의 길이를 입력하세요 : ");
			int a = sc.nextInt();
			
			System.out.print("높이를 입력하세요 : ");
			int r = sc.nextInt();
			
			result = (a * r) / 2;
			
			System.out.print("구하고자 하는 삼각형의 면적은 " + result + "입니다.");
		} 
		
		else
			System.out.println("잘못 입력했습니다. 다시 시작해주세요.");
		
		sc.close();
	}
}
