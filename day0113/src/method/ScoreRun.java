package method;

import java.util.Scanner;

public class ScoreRun {
	public static void main(String[] args) {
		//국어, 수학, 영어 3과목의 점수를 각각 입력받아서 총점과 평균을 출력하는
		//자바프로그램을 작성하여 보시오. 단, 총점과 평균의 기능을 수행하는 메소드를 별도로 작성하시오.

		Score score = new Score();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어, 영어, 수학 점수를 순서대로 각각 입력하세요 : ");
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int math = sc.nextInt();
		
		int total = score.total(kor, eng, math);
		double average = score.average(kor, eng, math);
		
		System.out.println("총점 : " + total + "점");
		System.out.println("평균 : " + average + "점");
	}
}