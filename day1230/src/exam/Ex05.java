package exam;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
//		문제5. 5명의 성적을 차례대로 입력받아 평균점수, 최고점수, 최저점수를 출력하는 자바프로그램을 작성하여 보시오. 
//		- 출력예 -
//		5명의 성적을 차례대로 입력하세요 : 60 50 100 90 70
//		5명의 평균점수 : 74.0점 / 최고점수 : 100점 / 최저점수 : 50점
		
		Scanner sc = new Scanner(System.in);
		System.out.print("5명의 성적을 차례대로 입력하세요 : ");
		
		int[] array = new int[5];
		int sum = 0;
		
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
			sum += array[i];
		}
		
		int maxNum = array[0];
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] > maxNum) {
				maxNum = array[i];
			} 
		}
		
		int minNum = array[0];
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] < minNum) {
				minNum = array[i];
			} 
		}
		
		double avg = sum / 5.0;
		
		System.out.println("5명의 평균점수 : " + avg + "점 / 최고점수 : " + maxNum
				+ "점 / 최저점수 : " + minNum + "점");
	}
}
