package inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamRun1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("input.txt");
			
			int i;
			while ((i = fis.read()) != -1) {
				System.out.println((char)i);
			}
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("파일 입력 예외 발생 : " + e.getMessage());
		} finally {
			try {
				fis.close();
			} catch (IOException e2) {
				// TODO: handle exception
				System.out.println("파일 입력 예외 발생(close) : " + e2.getMessage());
			} catch (NullPointerException e2) {
				// TODO: handle exception
				System.out.println("파일 입력 예외 발생(Null) : " + e2.getMessage());
			}
		}
		System.out.println("종료합니다.");
	}

}
