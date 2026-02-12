package keyboardin;

import java.util.Scanner;

public class ScannerInput {
	//While문과 Scanner를 이용해서 키보드로 입력된 데이터로 예금, 출금, 조회, 종료 기능을 제공하는 프로그램
	public static void main(String[] args) {
		
		boolean run = true;
		int balance = 0; //잔고
		Scanner sc = new Scanner(System.in);
		
		while (run) {
			System.out.println("-----------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("-----------------------------------");
			System.out.print("선택>");
			
			int choice = sc.nextInt();
			
			if (choice == 1) {
				System.out.print("예금액> ");
				int inputMoney = sc.nextInt();
				balance += inputMoney;
			} else if(choice == 2) {
				System.out.print("출금액> ");
				int outputMoney = sc.nextInt();
				balance -= outputMoney;
			} else if (choice == 3) {
				System.out.println("잔액> " + balance);
			} else {
				break;
			}
		}
		sc.close();
		
		System.out.println("프로그램 종료");
	}
}