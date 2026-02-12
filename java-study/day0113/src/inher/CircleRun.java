package inher;

import java.util.Scanner;

public class CircleRun {
	public static void main(String[] args) {
//		문제3. 사용자로부터 원의 반지름을 입력받아서 원의 둘레와 면적을 출력하는 자바프로그램을 작성하시오.
//		원의 반지름은 실수로 하며 원주율(3.14)은 상수 정의하시오.
//		단, 원의 둘레와 면적을 계산하는 부분은 메소드로 처리함. (매개변수 1개 (반지름), 리턴값 실수값)
		
		Scanner sc = new Scanner(System.in);
		CircleVolume cv = new CircleVolume();
		
		System.out.print("반지름을 입력하세요 : ");
		double r = sc.nextDouble();
		
		double cf = cv.circumferenceCircle(r);
		double areaCircle = cv.areaCircle(r);
		
		double circleVolume = cv.circleVolume(r);
		
		System.out.println("원의 둘레는 " + cf + "이며, 원의 면적은 " + areaCircle + "입니다.");
		System.out.println("구의 반지름은 " + r + "이며, 부피는 " + circleVolume + "입니다.");
	}
}