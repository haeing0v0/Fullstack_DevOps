package exam;

import java.util.Scanner;

public class Exam18 {

	public static void main(String[] args) {

//	문제18. 사용자로부터 영문 소문자를 무한반복 입력받아서 영문 대문자로 바꾸는 자바프로그램을 작성하여 보시오.
//	단, 사용자가 영문 소문자 'q'를 입력하면 반복문을 종료(break)하시오.
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("영문 소문자 입력 : ");
			String ch = sc.nextLine();
			
			if (ch.equals("q")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			ch = ch.toUpperCase();
			System.out.println("대문자 : " + ch);
		}
	}
}
