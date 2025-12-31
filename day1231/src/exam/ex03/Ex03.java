package exam.ex03;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
//		문제3. 반지름을 입력받아서 원의 둘레와 면적을 계산하는 자바프로그램을 작성하시오.
//		단, 원주율은 3.141592로 상수처리하며 원의 둘레와 면적은 메소드를 사용하여 풀이하시오.
//		- 출력예 -
//		반지름을 입력하세요 : 10
//		원의 둘레는 62.83이고 면적은 314.16입니다.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름을 입력하세요 : ");
		
		int r = sc.nextInt();
		
		Per per = new Per();
		double perimeter = per.perimeter(r);
		
		Area area = new Area();
		double area1 = area.areaTool(r);
		
		System.out.println("원의 둘레는 " + perimeter + "이고, 면적은 " + area1 + "입니다.");
	}
}
