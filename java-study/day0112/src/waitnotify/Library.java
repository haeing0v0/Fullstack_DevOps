package waitnotify;

import java.util.ArrayList;

public class Library {

	private ArrayList<String> sheIf = new ArrayList<String>();
	
	public Library() {
		sheIf.add("태백산맥 1");
		sheIf.add("태백산맥 2");
		sheIf.add("태백산맥 3");
	}
	
	public synchronized String lendBook() throws Exception {
		
		Thread th = Thread.currentThread();
		while (sheIf.size() == 0) {
			System.out.println(th.getName() + "waiting start");
			wait();
			System.out.println(th.getName() + "waiting end");
		}
		
		String book = sheIf.remove(0);
		System.out.println(th.getName() + ": " + book + "lend");
		
		return book;
	}
	
	public synchronized void returnBook(String book) throws Exception {
		
		Thread th = Thread.currentThread();
		sheIf.add(book);
		notifyAll();
		System.out.println(th.getName() + ": " + book + "return");
	}
}
