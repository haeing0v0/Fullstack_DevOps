package exam04;

public class Substractor extends Thread {

	@Override
	public void run() {
		synchronized (CounterRun.myCounter) { //동기화 블럭 추가
			int n = CounterRun.myCounter.getNumber();
			n = n - 10;
			try {
				sleep(500);
			} catch (InterruptedException e) {
				throw new RuntimeException();
			}
			CounterRun.myCounter.setNumber(n);
			System.out.println(CounterRun.myCounter.getNumber() + ":Substractor");
		}
	}
}
