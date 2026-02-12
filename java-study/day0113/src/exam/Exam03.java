package exam;

import java.util.Scanner;

public class Exam03 {
//	아래 출력예와 같이국어, 영어, 수학 3과목의 점수를 입력받아 아래 출력예와 같이 출력하는 프로그램을 작성하시오.
//	(if~else if~else 또는 switch~case 중 선택) (20점)
//
//	[출력예]
//	국어, 영어, 수학 점수를 차례대로 입력하세요 : 70 70 70
//	메뉴를 선택하세요 (1=총점, 2=평균, 3=종료) : 1(2)
//	국어, 영어, 수학 점수의 총점(평균)은 210(70.00)점입니다.
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어, 영어, 수학 점수를 차례대로 입력하세요 : ");
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int math = sc.nextInt();
		
		System.out.print("메뉴를 선택하세요 (1=총점, 2=평균, 3=종료) : ");
		int menuNum = sc.nextInt();
		
		int sum = kor + eng + math;
		double avg = sum / 3.0;
		
		if (menuNum == 1) {
			System.out.println("국어, 영어, 수학 점수의 총점은 " + sum + "점입니다.");
		} else if (menuNum == 2) {
			System.out.println("국어, 영어, 수학 점수의 평균은 " + avg + "점입니다.");
		} else if (menuNum == 3) {
			System.out.println("프로그램을 종료합니다.");
		} else {
			System.out.println("메뉴를 잘못 선택하셨습니다. 다시 선택해주세요.");
		}
		
		sc.close();
	}
}