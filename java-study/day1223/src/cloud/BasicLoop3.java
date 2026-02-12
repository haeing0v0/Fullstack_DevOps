package cloud;

import java.util.Scanner;

public class BasicLoop3 {

	public static void main(String[] args) {
		
		boolean bool = true;
		
		while (bool) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("키보드로 문자 입력 : ");
			String txt = sc.nextLine();
			System.out.println("txt = " + txt);
			
			//자바에서 문자열 비교시 반드시 equals() 메서드를 사용한다.
			if (txt.equals("q") || txt.equals("Q")) { 
				//break;
				bool = false;
			}
		}

	}
}
