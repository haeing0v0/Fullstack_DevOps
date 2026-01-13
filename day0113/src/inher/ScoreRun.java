package inher;

import java.util.Scanner;

public class ScoreRun {
	public static void main(String[] args) {
		
		Avg avg = new Avg();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어, 영어, 수학 점수를 순서대로 각각 입력하세요 : ");
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int math = sc.nextInt();
		
		int total = avg.sum(kor, eng, math);
		double average = avg.avg(total);
		
		System.out.println("총점 : " + total + "점");
		System.out.println("평균 : " + average + "점");
	}
}