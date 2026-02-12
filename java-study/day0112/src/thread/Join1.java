package thread;

public class Join1 extends Thread {
	
	int start, end, sum;
	
	public Join1(int start, int end) {
		this.start = start;
		this.end = end;
	}
	
	@Override
	public void run() {
		for (int i = start; i < end; i++) {
			sum += i;
		}
	}
}
