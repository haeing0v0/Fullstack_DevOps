package exam;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
//		문제3. 상점에 가면 우리는 상품에 대한 돈을 내고 영수증을 받는다. 영수증에는 잔돈 등이 인쇄되어 있다. 구입한 상품의 가격과 손님한테 받은 금액을 입력하면 잔돈을 출력하는 자바프로그램을 작성하여 보시오.
//		- 출력예 -
//		받은 돈 입력 : 10000
//		상품의 총액 입력 : 7500
//		남은 잔돈은 2500원 입니다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("받은 돈 입력 : ");
		int money = sc.nextInt();
		
		System.out.print("상품의 총액 입력 : ");
		int sel = sc.nextInt();
		
		System.out.println("남은 잔돈은 " + (money - sel) + "원 입니다.");
		
		sc.close();
	}

}
