package anonyexam;

public class AnonymousRun {
	public static void main(String[] args) {
		
		Anonymous anony = new Anonymous();
		anony.field.start();
		anony.method1();
		anony.method2(new Worker() {
			@Override
			void start() {
				System.out.println("테스트를 합니다.");
			}
		});
	}
}