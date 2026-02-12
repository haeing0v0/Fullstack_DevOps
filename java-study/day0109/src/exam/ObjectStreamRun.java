package exam;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ObjectStreamRun {
	//실행결과
	//1 제목1 내용1, 글쓴이1 2026-01-09
	//2 제목2 내용2, 글쓴이1 2026-01-09
	//3 제목3 내용3, 글쓴이1 2026-01-09
	
	public static void writeList() {
		//List 생성
		List<Board> list = new ArrayList<>();
		Date date = new Date();
		//List에 Board 객체 저장
		list.add(new Board(1, "제목1", "내용1", "글쓴이1", date));
		list.add(new Board(2, "제목2", "내용2", "글쓴이2", date));
		list.add(new Board(3, "제목3", "내용3", "글쓴이3", date));
		//출력 스트림을 이용해서 출력
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream("C:/Temp/board.db");
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(list);
		} catch (Exception e) {
			System.out.println("예외 발생 : " + e.getMessage());
		} finally {
			try {
				oos.close();
				fos.close();
				System.out.println("출력을 종료합니다.");
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	public static void readList() {
		//입력 스트림을 이용해서 List 읽기
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream("C:/Temp/board.db");
			ois = new ObjectInputStream(fis);
			
			List<Board> list = (List<Board>)ois.readObject();
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

			for (Board b : list) {
				System.out.println(
					b.getBno() + " " +
					b.getTitle() + " " +
					b.getContent() + " " +
					b.getWriter() + " " +
					sdf.format(b.getDate())
				);
			}
		} catch (Exception e) {
			System.out.println("예외 발생 : " + e.getMessage());
		} finally {
			try {
				ois.close();
				fis.close();
				System.out.println("입력을 종료합니다.");
			} catch (Exception e2) {
				System.out.println("예외 발생 : " + e2.getMessage());
			}
		}
	}
	
	public static void main(String[] args) {
		writeList();
		readList();
		
		//List<Board> list = readList();
	}
}
