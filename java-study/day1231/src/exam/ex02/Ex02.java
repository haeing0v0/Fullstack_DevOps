package exam.ex02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
//		문제2. 문제1의 상속을 위해 평균(Avg) 클래스를 만들고 상속을 이용하여
//		자식클래스를 출력하는 자바프로그램을 작성하여 보시오.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("국어, 수학, 영어 3과목의 점수를 순서대로 입력하세요 : ");
		
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int math = sc.nextInt();
		
		Avg aver = new Avg(); 
		int total = aver.total(kor, eng, math);
		double avg = aver.average(total);
		
		System.out.println("세 과목의 총점은 " + total + "점이고, 평균은 " + avg + "점입니다.");
	}
}
