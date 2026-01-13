package keyboardin;

import java.util.Scanner;

public class StudentScore {
	public static void main(String[] args) {
		
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner sc = new Scanner(System.in);
		
		while (run) {
			System.out.println("----------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("----------------------------------------------------");
			System.out.print("선택>");
			
			int choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				System.out.print("학생수> ");
				studentNum = sc.nextInt();
				scores = new int[studentNum];
				break;
			case 2:
				System.out.print("점수입력> ");
				for (int i = 0; i < scores.length; i++) {
					System.out.print("scores[" + i + "]> ");
					scores[i] = sc.nextInt();
				}
			} 
		}
	}
}