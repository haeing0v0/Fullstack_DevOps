package exam01;

public class Music implements Runnable { //구현체
	
	@Override
	public void run() {
		System.out.println("음악을 듣는다.");
	}
}
