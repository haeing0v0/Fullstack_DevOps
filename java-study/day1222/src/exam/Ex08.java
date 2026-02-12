package exam;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
//		문제8. 전기요금을 계산하는 출력예와 같이 출력하는 자바프로그램을 작성하시오. 단, 기본요금은 1390원이고 kw당 요금은 164원으로 한다.
//		- 출력예 -
//		사용 kw를 입력하세요 : 100
//		사용하신 전기요금은 17790원입니다.

		Scanner sc = new Scanner(System.in);
		
		System.out.print("사용 kw를 입력하세요 : ");
		int kw = sc.nextInt();
		
		int result = 1390 + kw * 164;
		
		System.out.println("사용하신 전기요금은 " + result + "원입니다.");
		
		sc.close();
	}
}
