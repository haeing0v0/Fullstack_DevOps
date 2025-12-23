package exam;

import java.util.Scanner;

public class Exam10 {

	public static void main(String[] args) {
		
//		문제10. switch문을 사용하여 아래 출력예와 같이 자바프로그램을 작성하여 보시오.
//		단, 합격여부는 3과목 중 한 과목이라도 40점 미만이거나 평균점수가 60점 미만이면 불합격으로 출력하며
//		그 외에는 합격으로 출력하시오.
//		- 출력예 -
//		전기, 전자, 프로그래밍 3과목의 성적을 입력하세요 : 90 100 30
//		=== 메뉴 ===
//		(1) 총점계산 (2) 평균계산 (3) 합격여부 (4) 종료
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("전기, 전자, 프로그래밍 3과목의 성적을 입력하세요 : ");
		int power = sc.nextInt();
		int elec = sc.nextInt();
		int pro = sc.nextInt();
		
		System.out.println("=== 메뉴 ===");
		System.out.println("(1) 총점계산 (2) 평균계산 (3) 합격여부 (4) 종료");
		int select = sc.nextInt();
		
		double avg = (power + elec + pro) / 3;
		String result;
		int sum = 0;
		
		if (avg > 60 && power > 40 && elec > 40 && pro > 40)
			result = "합격";
		else
			result = "불합격";
			
		
		switch (select) {
		case 1:
			sum = power + elec + pro;
			System.out.println("총점은 " + sum + "점입니다.");
			break;
		case 2:
			System.out.println("평균은 " + avg + "점입니다.");
			break;
		case 3:
			System.out.println(result + "입니다.");
			break;
		case 4:
			System.out.println("프로그램을 종료합니다.");
			break;
		}
		sc.close();
	}
}
