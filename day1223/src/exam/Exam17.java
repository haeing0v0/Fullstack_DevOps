package exam;

import java.util.Scanner;

public class Exam17 {

	public static void main(String[] args) {
		
//		문제17. 반복문을 사용하여 3명의 점수를 입력받아 총점과 평균을 구하는 자바프로그램을 작성하여 보시오.
//		- 출력예 -
//		1번 학생의 점수를 입력하세요 : 60
//		2번 학생의 점수를 입력하세요 : 70
//		3번 학생의 점수를 입력하세요 : 80
//		3명의 점수 합계는 210점이고 평균은 70.00점입니다.
		
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int[3];
		int sum = 0;
		
		for (int i = 0; i < 3; i++) {
			System.out.print((i+1) + "번 학생의 점수를 입력하세요 : ");
			a[i] = sc.nextInt();
			sum += a[i];
		}
		double avg = sum / 3;
		
		System.out.println("3명의 점수 합계는 " + sum + "점이고 평균은 " + avg + "점입니다.");
	}

}
