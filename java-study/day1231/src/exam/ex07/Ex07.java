package exam.ex07;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
//		문제7. 아래 출력예와 같이 자바프로그램을 작성하여 보시오.단, 합격여부는 기존 클래스를 상속하여
//		작성하시오. 합격여부는 3과목 중 한 과목이라도 40점 미만이거나 평균점수가 60점 미만이면
//		불합격으로 출력하며 그 외에는 합격으로 출력하시오.
//		- 출력예 -
//		데이터베이스, 디지털논리회로, 프로그래밍 3과목의 성적을 입력하세요 : 90 100 30
//		=== 메뉴 ===
//		(1) 총점계산 (2) 평균계산 (3) 합격여부
		
		Pass pass = new Pass();
		Scanner sc = new Scanner(System.in);

		System.out.print("데이터베이스, 디지털논리회로, 프로그래밍 3과목의 성적을 입력하세요 : ");
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		int sum = pass.sum(n1, n2, n3);
		double avg = pass.avg(sum);
		pass.menu();
		
		int num = sc.nextInt();
		
		switch (num) {
		case 1:
			System.out.println("총점은 " + sum + "점 입니다.");
			break;
		case 2:
			System.out.println("평균은 " + avg + "점 입니다.");
			break;
		case 3:
			pass.result(n1, n2, n3, avg);
			break;

		default:
			System.out.println("1~3 사이값 중에 입력하세요.");
			break;
		}
	}
}