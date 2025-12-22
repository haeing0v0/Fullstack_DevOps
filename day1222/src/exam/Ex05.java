package exam;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
//		문제5. 본봉과 보너스를 각각 입력받아 세금이 총 금액의 10%일때 실제 수입과 연봉을 출력하는 자바프로그램을 작성하시오.
//		- 출력예 -
//		본봉(단위:만원)을 입력하세요 : 200
//		보너스(단위:만원)를 입력하세요 : 20
//		총수입은 198.0만원이고 연봉은 2376.0만원입니다.

		Scanner sc = new Scanner(System.in);
		
		System.out.print("본봉(단위:만원)을 입력하세요 : ");
		int money = sc.nextInt();
		
		System.out.print("보너스(단위:만원)를 입력하세요 : ");
		int bonus = sc.nextInt();
		
		double year = (money+ bonus) * 12 * 0.9 ;
		
		System.out.println("총 수입은 " + money + "만원이고 연봉은 " + year + "만원입니다.");
		
		sc.close();
	}
}
