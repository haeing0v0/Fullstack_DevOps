package keyboardin;

import java.util.Scanner;

public class StudentScore {
	public static void main(String[] args) {
		
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		int sum = 0;
		double avg = 0.0;
		int maxPoint = 0;
		Scanner sc = new Scanner(System.in);
		
		while (run) {
			System.out.println("----------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("----------------------------------------------------");
			System.out.print("선택> ");
			
			int choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				System.out.print("학생수> ");
				studentNum = sc.nextInt();
				scores = new int[studentNum];
				break;
			case 2:
				System.out.println("점수입력> ");
				for (int i = 0; i < scores.length; i++) {
					System.out.print("scores[" + i + "]> ");
					scores[i] = sc.nextInt();
				}
				break;
			case 3:
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "]> " + scores[i]);
				}
				break;
			case 4:
				for (int i = 0; i < scores.length; i++) {
					if (maxPoint < scores[i]) {
						maxPoint = scores[i];
					}
					sum += scores[i];
					avg = (double)sum / scores.length;
				}
				System.out.println("최고점수 : " + maxPoint);
				System.out.println("평균점수 : " + avg);
				break;
			case 5:
				System.out.println("프로그램 종료");
				run = false;
				break;
			} 
		}
	}
}