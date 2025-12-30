package cloud;

import java.util.ArrayList;

public class BookArrayList {
	public static void main(String[] args) {
		ArrayList<Book> lib = new ArrayList<Book>();
		lib.add(new Book("태백산역", "조정래"));
		lib.add(new Book("데미안", "헤르만 헤세"));
		lib.add(new Book("어떻게 살 것인가", "유시민"));
		lib.add(new Book("어린왕자", "생택쥐베리"));
		
		for (int i = 0;i < lib.size(); i++) {
			Book book = lib.get(i);
			System.out.println("book = " + book);
		}
	}
}
