package exam;

import java.util.Scanner;

public class Exam02 {
	//아래 출력예와 같이 정수를 무한반복 입력받아서 합계를 누적하는 프로그램을 작성하시오.
	//단, 합계가 500 이상이면 반복문을 종료하시오. (20점)
	
	public static void main(String[] args) {
		
		boolean tool = true;
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while (tool) {
			System.out.print("정수를 입력하세요 : ");
			int num = sc.nextInt();
			sum += num;
			
			if (sum >= 500) {
				System.out.println("합계가 500 이상이며, 전체 합계는 " + sum + "입니다.");
				tool = false;
			} else {
				System.out.println("현재까지의 합계는 " + sum + "입니다.");
			}
		}
		
		sc.close();
	}
}
