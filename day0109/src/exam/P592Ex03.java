package exam;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class P592Ex03 {
	public static void main(String[] args) {
		
		FileOutputStream fos = null;
		OutputStreamWriter osw = null;
		
		try {
			fos = new FileOutputStream("a.txt");
			osw = new OutputStreamWriter(fos);
			
			osw.write("지금까지 자바 정말 재미있게 공부했어요^^");
			osw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
				System.out.println("출력이 완료되었습니다.");
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}