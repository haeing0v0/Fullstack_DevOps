package anonymous;

public class Anonymous {

	Person field = new Person() { //필드로 익명 객체
		
		void work() {
			System.out.println("출근합니다.");
		}
		
		@Override
		void wake() {
			System.out.println("5시30분에 일어납니다.");
			work();
		}
	};
	
	void method1() {
		Person localVar = new Person() { //로컬 변수로 익명 객체
			
			void walk() {
				System.out.println("산책합니다.");
			}
			
			@Override
			void wake() {
				System.out.println("7시에 일어납니다.");
				walk();
			}
		};
		localVar.wake();
	}
	
	void method2(Person person) { //매서드 호출, 매개변수
		person.wake();
		//field.work(); 외부에서는 접근할 수 없다.
	}
}
