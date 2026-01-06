package collection;

import java.util.List;
import java.util.Vector;

public class VectorRun {
	public static void main(String[] args) {

		List<Board> list = new Vector<Board>();
		
		list.add(new Board("제목1", "내용1", "홍길동")); //0
		list.add(new Board("제목2", "내용2", "김유신")); //1
		list.add(new Board("제목3", "내용3", "강감찬")); //2
		
		for (int i = 0; i < list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.subject + ", " + board.content + ", "
					+ board.writer);
		}
		
		list.remove(0);
		
		for (int i = 0; i < list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.subject + ", " + board.content + ", "
					+ board.writer);
		}
	}
}
