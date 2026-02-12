package inputstream;

import java.io.IOException;

public class SystemInRun {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("알파벳 하나를 쓰고 [Enter]를 누루세요");
		
		int i;
		
		i=System.in.read(); //a
		System.in.read(); // 13
		System.in.read(); // 10
		//sc.nextLine(); //라인엔터
		System.out.println("i=" + i);
		System.out.println("(char)i=" + (char)i);
	}

}
