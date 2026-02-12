package exam;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
//		문제4. 오옴의 법칙(V=IR)을 활용하여 출력예와 같이 전류와 저항을 입력하면 전압을 계산하는 자바프로그램을 작성하시오.
//		- 출력예 -
//		전류값를 입력하세요.
//		5.0
//		저항값을 입력하세요.
//		100.0
//		전류는 5.0암페어이고 저항은 100.0옴이라면 전압은 500.0볼트입니다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("전류값를 입력하세요.");
		double ru = sc.nextDouble();
		
		System.out.println("저항값을 입력하세요.");
		double han = sc.nextDouble();
		
		System.out.println("전류는 " + ru + "암페어이고, 저항은 " + han + "옴이라면 전압은 " + (ru * han) + "볼트입니다.");

		sc.close();
	}

}
