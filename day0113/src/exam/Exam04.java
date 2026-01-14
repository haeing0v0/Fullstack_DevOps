package exam;

import java.util.Scanner;

public class Exam04 {
//	아래 출력예와 같이 프로그램을 작성하시오.
//	단, 합격여부는 3과목 중 한 과목이라도 40점 미만이거나 평균점수가 60점 미만이면 불합격으로 출력하며
//	그 외에는 합격으로 출력하시오(20점).
//	전자
//	[출력예]
//	전기, 전자, 프로그래밍 3과목의 성적을 입력하세요 : 90 100 30
//	=== 메뉴 ===
//	(1) 총점계산 (2) 평균계산 (3) 합격여부 (4) 종료
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean menu = true;
		
		System.out.print("전기, 전자, 프로그래밍 3과목의 성적을 입력하세요 : ");
		int electricity = sc.nextInt(); //전기
		int electron = sc.nextInt(); //전자
		int programming = sc.nextInt();
		
		int sum = electricity + electron + programming;
		double avg = sum / 3.0;
		
		while (menu) {
			System.out.println("=== 메뉴 ===");
			System.out.println("(1) 총점계산 (2) 평균계산 (3) 합격여부 (4) 종료");
			System.out.print("선택 > ");
			int menuNum = sc.nextInt();
			switch (menuNum) {
			case 1:
				System.out.println("세 과목의 총점은 " + sum + "점입니다.");
				break;
			case 2:
				System.out.println("세 과목의 평균은 " + avg + "점입니다.");
				break;
			case 3:
				if (electricity < 40 || electron < 40 || programming < 40 || avg < 60) {
					System.out.println("불합격입니다.");
				} else {
					System.out.println("합격입니다.");
				}
				break;
			case 4:
				System.out.println("프로그램을 종료합니다.");
				menu = false;
				break;
			default:
				System.out.println("메뉴 1~4 중에서 선택해주세요.");
			}
		}
		
		sc.close();
	}
}