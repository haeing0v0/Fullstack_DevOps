package cloud;

public class TwoArray {

	public static void main(String[] args) {
		
		int[][] intArray1 = {{1, 2, 3},
							{4, 5, 6}};
		
		System.out.println(intArray1[0][0]);
		
		int[][] intArray2 = new int[3][3];
		
		for(int i = 0; i < intArray1.length; i++) { //반복횟수 : 2
			for (int j = 0; j < intArray1[i].length; j++) { //반복횟수 : 3
			System.out.println("intArray1[" + i + "][" + j + "] = " + intArray1[i][j]);
		
		//System.out.println("intArray.length = " + intArray1.length);
			}
		}
	}
}
