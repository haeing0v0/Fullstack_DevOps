package etc;

import java.io.RandomAccessFile;

public class RandomAccessFileRun {
	public static void main(String[] args) {
		
		RandomAccessFile rf = null;
		
		try {
			rf = new RandomAccessFile("random.txt", "rw");
			rf.writeInt(100);
			System.out.println("파일포인터 위치 : " + rf.getFilePointer());
			
			rf.writeDouble(3.14);
			System.out.println("파일포인터 위치 : " + rf.getFilePointer());
			
			rf.writeUTF("안녕");
			System.out.println("파일포인터 위치 : " + rf.getFilePointer());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}