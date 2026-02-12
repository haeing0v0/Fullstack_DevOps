package exam;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
//		문제10. 달의 중력은 지구의 약 17%라고 한다. 자신의 몸무게를 입력받아서 달에서의 몸무게를 계산하는 자바프로그램을 작성하시오.
//		- 출력예 -
//		몸무게를 입력하시오 : 70
//		달에서의 몸무게는 11.9kg입니다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몸무게를 입력하시오 : ");
		int weight = sc.nextInt();
		
		double result = weight * 0.17;
		
		System.out.println("달에서의 몸무게는 " + result + "kg입니다.");
		
		sc.close();
	}
}
