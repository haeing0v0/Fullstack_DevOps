package exam;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
//		문제3. 정수 5개를 입력받아 가장 큰 배열요소 값을 찾는 자바프로그램을 작성하시오.
//		- 출력예 -
//		정수 5개를 차례대로 입력하세요 : 10 70 80 60 30
//		5개 정수 중 가장 큰 값은 80입니다.

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 5개를 차례대로 입력하세요 : ");
		
		int[] array = new int[5];
		
		
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		
		int maxNum = array[0];
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] > maxNum) {
				maxNum = array[i];
			} 
		}
		
		System.out.println("5개 정수 중 가장 큰 값은 " + maxNum + "입니다.");
	}
}
