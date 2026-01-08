package lamda;

public class StringConcatRun {
	public static void main(String[] args) {
		
		String s1 = "Hello";
		String s2 = "World";
		
		StringConcatImpl concat = new StringConcatImpl();
		concat.makeString(s1, s2);
		
		StringConcat concat1 = (s, v) -> System.out.println(s + ", " + v);
	}
}