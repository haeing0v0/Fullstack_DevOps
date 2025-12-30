package cloud;

import java.util.Scanner;

public class ScoreRun {

	public static void main(String[] args) {
		
		Score score = new Score();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어, 수학, 영어 3과목의 점수를 각각 입력하세요 : ");
		int kor = sc.nextInt();
		int math = sc.nextInt();
		int eng = sc.nextInt();
		
		int returnTotal = score.total(kor, math, eng);
		double returnAverage = score.average(kor, math, eng);
		
		System.out.println("세 과목의 총점 : " + returnTotal);
		System.out.println("세 과목의 평균 : " + returnAverage);
	}

}
