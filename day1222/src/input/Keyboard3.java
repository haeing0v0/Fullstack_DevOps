package input;

import java.util.Scanner;

public class Keyboard3 {

	public static void main(String[] args) {
		
		//자신의 생년, 월, 일을 순서대로 입력받아 출력하는 자바프로그램을 작성하시오.
		// - 출력 예 -
		// 생년월일을 차례대로 입력하세요 : 1980 10 30
		// 입력하신 생년월일은 1980년 10월 30일생입니다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("생년월일을 차례대로 입력하세요: ");
		
		int year = sc.nextInt();
		int month = sc.nextInt();
		int day = sc.nextInt();
		
		System.out.println("입력하신 생년월일은 " + year + "년 " + month + "월 " + day + "일생입니다.");
		sc.close();
	}

}
