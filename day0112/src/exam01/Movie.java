package exam01;

public class Movie extends Thread { //상속

	@Override
	public void run() {
		
		for(int i = 0; i < 3; i++) {
			while(true) {
				System.out.println("영화를 본다.");
			
				try {
					sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
