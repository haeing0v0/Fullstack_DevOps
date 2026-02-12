package exam;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
//		문제4. 실수 5개를 입력받아 가장 작은 배열요소 값을 찾는 자바프로그램을 작성하시오.
//		- 출력예 -
//		실수 5개를 차례대로 입력하세요 : 50.0 70.0 20.0 55.5 30.8
//		5개 실수 중 가장 작은 값은 20.0입니다.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("실수 5개를 차례대로 입력하세요 : ");
		
		double[] array = new double[5];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextDouble();
		}
		
		double minNum = array[0];
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] < minNum) {
				minNum = array[i];
			} 
		}
		
		System.out.println("5개 실수 중 가장 작은 값은 " + minNum + "입니다.");
	}
}
