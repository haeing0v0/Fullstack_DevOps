package waitontify;

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
		
		return ""; //꼭 반환값 확인
	}
}
