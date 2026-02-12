package exam.ex04;

import java.util.Scanner;

import exam.ex03.Area;
import exam.ex03.Per;

public class Ex04 {

	public static void main(String[] args) {
//		문제4. 문제3에서 부피를 계산하는 기능을 상속을 이용하여 자식클래스를 출력하는 자바프로그램을 작성하시오.
//		단, 구의 부피는 (4/3)*π*r^3임.
//		- 출력예 -
//		반지름을 입력하세요 : 5
//		원의 둘레는 00이고 면적은 000입니다.
//		구의 반지름은 5이며 부피는 523.333입니다.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름을 입력하세요 : ");
		
		int r = sc.nextInt();
		
		Per per = new Per();
		double perimeter = per.perimeter(r);
		
		Area area = new Area();
		double area1 = area.areaTool(r);
		
		GuArea guArea1 = new GuArea();
		double guArea = guArea1.guArea(r);
		
		System.out.println("원의 둘레는 " + perimeter + "이고, 면적은 " + area1 + "입니다.");
		System.out.println("구의 반지름은 " + r + "이며 부피는 " + guArea + "입니다.");

	}
}
