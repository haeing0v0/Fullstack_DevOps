package exam;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
//		문제12. 몸무게와 키를 입력받아 신체질량지수(BMI)를 구하는 자바프로그램을 작성하시오.
//		단, bmi = 몸무게(kg)/키(m)의 제곱
//		- 출력예 -
//		이름을 입력하세요 : 홍길동
//		몸무게를 입력하세요 (kg) : 45
//		키를 입력하세요 (m) : 1.68
//		홍길동님의 bmi는 15.9입니다
		
		Scanner sc = new Scanner(System.in);

        System.out.print("이름을 입력하세요 : ");
        String name = sc.nextLine();

        System.out.print("몸무게를 입력하세요 (kg) : ");
        int weight = sc.nextInt();

        System.out.print("키를 입력하세요 (m) : ");
        double height = sc.nextDouble();

        double bmi = weight / (height * height);

        System.out.printf("%s님의 bmi는 %.1f입니다.%n", name, bmi);

        sc.close();
	}

}
