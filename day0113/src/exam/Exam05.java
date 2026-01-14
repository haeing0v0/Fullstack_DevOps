package exam;

import java.util.Scanner;

public class Exam05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean tool = true;
		
		System.out.println("************************");
		System.out.println("*     숫자 맞추기 게임     *");
		System.out.println("************************");
		
		int randomNum = (int)(Math.random() * 100) + 1;
		
		while (tool) {
			System.out.print("1부터 100까지 사이의 숫자를 입력하세요 : ");
			int num = sc.nextInt();
			
			if (num > randomNum) {
				System.out.println("입력한 정수는 " + num + "이며 정답보다 큰 수입니다.");
			} else if (num < randomNum) {
				System.out.println("입력한 정수는 " + num + "이며 정답보다 작은 수입니다.");
			} else {
				System.out.println("축하합니다! 입력한 정수는 " + num + "이며 정답입니다!");
			}
		}
		
		sc.close();
	}
}