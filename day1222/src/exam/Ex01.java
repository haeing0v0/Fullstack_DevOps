package exam;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
//		문제1. 아래와 같이 출력하는 자바프로그램을 작성하시오.
//		- 출력예 -
//		키(cm)를 입력하세요 : 180 
//		몸무게(kg)를 입력하세요 : 75
//		입력하신 키는 180cm이고 몸무게는 75kg입니다.

		Scanner sc = new Scanner(System.in);
		
		System.out.print("키(cm)를 입력하세요 : ");
		int height = sc.nextInt();
		
		System.out.print("몸무게(kg)를 입력하세요 : ");
		int weight = sc.nextInt();
		
		System.out.print("입력하신 키는 " + height + "cm이고 몸무게는 " + weight + "kg입니다.");
		
		sc.close();
	}
}
