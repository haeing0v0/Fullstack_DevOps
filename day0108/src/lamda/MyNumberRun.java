package lamda;

public class MyNumberRun {
	public static void main(String[] args) {
		
		MyNumber max = (n1, n2) -> (n1 > n2) ? n1 : n2;
		
		System.out.println("MaxNumber.max() = " + max.getMax(10, 20));
	}
}