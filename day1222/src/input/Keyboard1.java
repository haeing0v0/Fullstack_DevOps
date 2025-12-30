package input;

import java.util.Scanner; //자동 import 안될 때 shift + ctrl + o를 누른다.

public class Keyboard1 {

	public static void main(String[] args) throws Exception {

		//int num = System.in.read(); //throws(정적처리), try-catch(동적처리)
		
		System.out.print("키보드로 값을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		String keyBoard = sc.nextLine(); //[linefeed(10번) + carrige return(13번)] = Enter
		int number = Integer.parseInt(keyBoard); //wrapper 클래스
		System.out.println("keyBoard = " + (keyBoard + 10));
		System.out.println("number = " + (number + 10));

		sc.close();
	}
}
