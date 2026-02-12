package exam;

import java.util.Scanner;

public class Exam08 {

	public static void main(String[] args) {
		
//		문제8. 국어, 영어, 수학 3과목의 점수를 입력받아 아래 출력예와 같이 출력하는 자바프로그램을 작성하시오.
//		(if~else if~else 또는 switch~case 중 선택)
//		- 출력예 -
//		국어, 영어, 수학 점수를 차례대로 입력하세요 : 70 70 70
//		메뉴를 선택하세요 (1=총점, 2=평균, 3=종료) : 1(2)
//		국어, 영어, 수학 점수의 총점(평균)은 210(70.00)점입니다.

		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어, 영어, 수학 점수를 차례대로 입력하세요 : ");
		
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int math = sc.nextInt();
		
		System.out.print("메뉴를 선택하세요 (1=총점, 2=평균, 3=종료) : ");
		
		int select = sc.nextInt();
		int sum = 0;
		double avg = 0;
		
		if (select == 1) {
			sum = kor + eng + math;
			System.out.println("국어, 영어, 수학 점수의 총점은 " + sum + "점입니다.");
		} else if (select == 2) {
			avg = (kor + eng + math) / 3;
			System.out.println("국어, 영어, 수학 점수의 평균은 " + avg + "점입니다.");
		} else if (select == 3) {
			System.out.println("프로그램을 종료합니다.");
		} else
			System.out.println("잘못 입력했습니다. 다시 시작해주세요");
		
	}

}
