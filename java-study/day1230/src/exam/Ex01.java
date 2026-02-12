package exam;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
//		문제1. 국어, 영어, 수학점수와 합계를 출력하는 자바프로그램을 작성하여 보시오.
//		단, 과목(배열명 : score)을 배열로 처리하여 풀이하시오.
//		-출력예 -
//		국어, 영어, 수학 점수를 차례대로 입력하세요 : 85 95 70
//		국어 : 85점, 영어 : 95점, 수학 : 70점
//		세 과목의 합계는 250점이고 평균은 83.3333점입니다.

		int[] score = new int[3];
		int sum = 0;
		double avg = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("국어, 영어, 수학 점수를 차례대로 입력하세요 : ");
		
		for (int i = 0; i < score.length; i++) {
			score[i] = sc.nextInt();
			sum += score[i];
		}
		
		avg = sum / 3.0;
		
		System.out.println("국어 : " + score[0] + "점, 영어 : " + score[1]
				+ "점, 수학 : " + score[2] + "점");
		
		System.out.println("세 과목의 합계는 " + sum + "점이고 평균은 " +  avg + "점입니다.");
	}
}
