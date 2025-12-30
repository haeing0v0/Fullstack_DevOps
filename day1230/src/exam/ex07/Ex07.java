package exam.ex07;

public class Ex07 {

	public static void main(String[] args) {
		//214쪽 '배열 초기화하고 출력하기' 예제의 main() 함수에 int sum = 0;을 작성하고,
		//8행 코드를 수정하여 배열의 모든 요소 합을 계산하는 프로그램을 만들어보세요.

		int[] num = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int sum = 0;
		
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		System.out.println("sum = " + sum);
	}
}
