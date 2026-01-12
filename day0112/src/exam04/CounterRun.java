package exam04;

public class CounterRun {
	
	public static Counter myCounter = new Counter(10);
	
	public static void main(String[] args) throws InterruptedException {
		Adder adder = new Adder();
		Substractor substractor = new Substractor();
		adder.start();
		substractor.start();
		
		adder.join();
	    substractor.join();
	    
		System.out.println(myCounter.getNumber());
	}
}
