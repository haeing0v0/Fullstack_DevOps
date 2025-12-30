package exam.ex03;

public class Ex03 {

	public static void main(String[] args) {
		//배열 길이가 5인 정수형 배열을 선언하고, 1~10 중 짝수만을 배열에 저장한 후 그 합을 출력하세요.
		
//		int[] array = new int[5];
//		int sum = 0;
//		
//		for (int i = 0; i < array.length; i++) {
//				array[i] = (i + 1) * 2;
//				System.out.println("array[" + i + "] = " + array[i]);
//				sum += array[i];
//		}
		
		int[] num = new int[] {2, 4, 6, 8, 10};
		int sum = 0;
		
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		
		System.out.println("sum = " + sum);
	}
}
