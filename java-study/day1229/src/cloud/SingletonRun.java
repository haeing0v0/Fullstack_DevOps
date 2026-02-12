package cloud;

public class SingletonRun {

	public static void main(String[] args) {
		
		//Singleton sgt = new Singleton(); 접근제한자 private로 Singleton 클래스에 접근할 수 없다.
		
		Singleton sgt1 = Singleton.getInstance();
		Singleton sgt2 = Singleton.getInstance();
		
		System.out.println("sgt1 = " + sgt1.toString());
		System.out.println("sgt2 = " + sgt2.toString());
	}
}
