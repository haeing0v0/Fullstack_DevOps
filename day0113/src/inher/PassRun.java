package inher;

import java.util.Scanner;

public class PassRun {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Pass pass = new Pass();
		
		System.out.print("데이터베이스, 디지털논리회로, 프로그래밍 3과목의 성적을 입력하세요 : ");
		int data = sc.nextInt();
		int dig = sc.nextInt();
		int pro = sc.nextInt();
		
		System.out.println("=== 메뉴 ===");
		System.out.println("(1) 총점계산 (2) 평균계산 (3) 합격여부");
		int choice = sc.nextInt();
		
		int total = pass.sum(data, dig, pro);
		double avg = pass.avg(total);
		
		if (choice == 1) {
			System.out.println("총점은 " + total + "점입니다.");
		} else if (choice == 2) {
			System.out.println("평균은 " + avg + "점입니다.");
		} else if (choice == 3) {
			pass.result(data, dig, pro, avg);
		} else {
			System.out.println("잘못 입력했습니다. 다시 입력해주세요.");
		}
	}
}