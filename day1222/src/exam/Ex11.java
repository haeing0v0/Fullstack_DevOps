package exam;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
//		문제11. 1인치는 2.54센티미터이다. 키를 입력받아서 인치로 변환하는 자바프로그램을 작성하시오.
//		- 출력예-
//		키(cm)를 입력하세요 : 180
//		키 180센티미터를 인치로 변환하면 70.87인치입니다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키(cm)를 입력하세요 : ");
		int height = sc.nextInt();
		
		double result = height / 2.54;
		
		System.out.printf("키 %d센티미터를 인치로 변환하면 %.2f인치입니다\n", height, result);
		
		sc.close();
	}
}
