package exam04;

public class Adder extends Thread {
	
	@Override
	public void run() {
		synchronized (CounterRun.myCounter) {
			int n = CounterRun.myCounter.getNumber();
			n = n + 20;
			try {
				sleep(1000);
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
			CounterRun.myCounter.setNumber(n);
			System.out.println(CounterRun.myCounter.getNumber() + ":Adder");
		}
	}
}
