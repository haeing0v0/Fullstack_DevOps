package cloud;

public class IntArray {

	public static void main(String[] args) {
		
		int[] num1 = new int[10];
		int[] num2 = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] num3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int sum = 0;
		
		for (int i = 0; i < num1.length; i++) {
			System.out.print(", " + num1[i]);
		}
		System.out.println();
		
		for (int i = 0; i < num3.length; i++) {
			sum += num3[i];
		}
		System.out.print("sum = " + sum);
	}
}
