package exam01;

public class Music implements Runnable { //구현체
	
	@Override
	public void run() {
		
		for(int i = 0; i < 3; i++) {
			while(true) {
				System.out.println("음악을 듣는다.");
				
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
