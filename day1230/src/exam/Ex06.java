package exam;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
//		문제6. 2차원 배열을 이용하여 학생 3명의 4과목 성적을 차례대로 입력받아서 각각의 학생의 총점과 평균을 출력하는 자바프로그램을 작성하시오.
//		- 출력예 -
//		1번 학생의 4과목 성적을 차례대로 입력하세요 : 60 70 80 90
//		2번 학생의 4과목 성적을 차례대로 입력하세요 : 100 80 60 70
//		3번 학생의 4과목 성적을 차례대로 입력하세요 : 90 80 50 40
//
//		1번 학생의 총점은 00점이고 평균은 00.00점입니다. 
//		2번 학생의 총점은 00점이고 평균은 00.00점입니다. 
//		3번 학생의 총점은 00점이고 평균은 00.00점입니다.

		int[][] student = new int[3][4];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < student.length; i++) {
			System.out.print((i+1) + "번 학생의 4과목 성적을 차례대로 입력하세요 : ");
			for (int j = 0; j < student[i].length; j++) {
				student[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < student.length; i++) {
			int total = 0;
			for (int j = 0; j < student[i].length; j++) {
				total += student[i][j];
			}
			double avg = total / 4.0;
			System.out.println((i+1) + "번 학생의 총점은 " + total + "점이고 평균은 " + avg + "점입니다.");
		}
	}
}
