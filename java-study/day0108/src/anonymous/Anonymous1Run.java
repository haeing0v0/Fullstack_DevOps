package anonymous;

public class Anonymous1Run {
	public static void main(String[] args) {
		
		Anonymous1 anony1 = new Anonymous1();
		anony1.field.turnOn();
		anony1.method1();
		anony1.method2(new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("스마트폰을 켭니다.");
			}
			
			@Override
			public void turnOff() {
				System.out.println("스마트폰을 끕니다.");
			}
		});
	}
}
