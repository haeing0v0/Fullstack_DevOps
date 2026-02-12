package exam;

import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("본봉(단위:만원)을 입력하세요 : ");
        String money = sc.nextLine();

        System.out.print("보너스(단위:만원)를 입력하세요 : ");
        String bonus = sc.nextLine();

        double base = Double.parseDouble(money);
        double extra = Double.parseDouble(bonus);

        double pay = (base + extra) * 0.90;

        System.out.println("총 수입은 " + pay + "만원이고 연봉은 " + pay * 12 + "만원입니다.");

        sc.close();
    }
}
