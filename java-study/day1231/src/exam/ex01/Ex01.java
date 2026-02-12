package exam.ex01;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
//		문제1. Score 클래스를 만들고, 국어, 수학, 영어 3과목의 점수를 각각 입력받아서
//		총점을 출력하는 자바프로그램을 작성하여 보시오. 단, 총점은 메소드를 사용하여 풀이하시오.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("국어, 수학, 영어 3과목의 점수를 순서대로 입력하세요 : ");
		
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int math = sc.nextInt();
		
		Score score = new Score();
		
		int total = score.total(kor, eng, math);
		System.out.println("세 과목의 총점은 " + total + "점입니다.");
	}
}
