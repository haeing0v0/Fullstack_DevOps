package lamda;

public class AddRun {
	public static void main(String[] args) {

		Add addFunction = (n1, n2) -> n1 + n2;
		
		System.out.println("Add.add() = " + addFunction.add(10, 20));
	}
}