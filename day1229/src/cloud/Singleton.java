package cloud;

public class Singleton {
	
	private static Singleton instance = new Singleton();
	
	private Singleton() {} //기본 생성자

	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		
		return instance;
	}
	
}
