package cloud;

public class MethodTestRun { //실행 클래스라고 부른다. (main()를 가지고 있기 때문이다.)
	public static void main(String[] args) {
		
		MethodTest method = new MethodTest();
		int returnValue = method.sum(1, 1);
		
		System.out.println("returnValue = " + returnValue);
		
		method.method1(); //메서드는 이름을 호출하여 사용한다.
		
		String masEve = method.mas();
		System.out.println(masEve);
	}
} 
