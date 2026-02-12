package exam01;

public class MediaRun {
	public static void main(String[] args) {
		// 동영상과 음악을 재생하는 두가지 스레드를 실행하는 코드를 작성하세요.

		Thread movieThread = new Movie();
		movieThread.start();
		
		Thread musicThread = new Thread(new Music());
		musicThread.start();
	}
}