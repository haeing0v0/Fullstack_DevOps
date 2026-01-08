package anonyexam;

public class Anonymous {

	//field
	Worker field = new Worker() {
		
		@Override
		void start() {
			System.out.println("디자인을 합니다.");
		}
	};
	
	//localVar
	void method1() {
		Worker localVar = new Worker() {
			@Override
			void start() {
				System.out.println("개발을 합니다.");
			}
		};
		localVar.start();
	}
	
	//메서드 매개변수
	void method2(Worker worker) {
		worker.start();
	}
}
