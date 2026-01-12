package exam01;

public class Movie extends Thread { //상속

	@Override
	public void run() {
		System.out.println("영화를 본다.");
	}
}
