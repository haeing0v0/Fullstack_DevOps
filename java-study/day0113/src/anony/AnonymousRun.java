package anony;

public class AnonymousRun {
	public static void main(String[] args) {
		
		Anonymous anony = new Anonymous();
		anony.field.run();
		anony.method1();
		
		anony.method2(new Bus());
		anony.method2(new Taxi() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				super.run();
			}
		});
	}
}