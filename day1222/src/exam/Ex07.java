package exam;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
//		문제7. 국어, 영어, 수학점수와 합계를 출력하는 자바프로그램을 작성하여 보시오.
//		-출력예 -
//		국어, 영어, 수학 점수를 차례대로 입력하세요 : 85 95 70
//		국어 : 85점, 영어 : 95점, 수학 : 70점
//		세 과목의 합계는 250점이고 평균은 83.3333점입니다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어, 영어, 수학 점수를 차례대로 입력하세요 : ");
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int math = sc.nextInt();
		
		int sum = kor + eng + math;
		double result = (double)sum / 3;
		
		System.out.println("국어 : " + kor + "점, 영어 : " + eng + "점, 수학 : " + math + "점");
		System.out.printf("세 과목의 합계는 %d점이고 평균은 %.4f점입니다.", sum, result);

		sc.close();
	}

}
