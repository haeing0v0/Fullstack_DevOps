package cloud;

public class BasicLoop2 {

	public static void main(String[] args) {

		//1~10 사이의 홀수를 구하는 코드를 작성하세요.(for문 사용)
		
//		for (int i = 1; i <= 10; i += 2) {
//			
//			System.out.print(i);
//		}
		
		int i, j, odd, odd1;
		
		for(i = 0, odd = 0; i < 10; i++) {
			odd = i++;
			System.out.print(", " + (odd + 1));
		}
		System.out.println();
	
		
		for (j = 0, odd1 = 0; j < 10; j++) {
			odd1 = j;
			
			if (j % 2 == 1) {
				continue;
			}
			
			System.out.print(", " + (odd1 + 1));
			
		}
	}
}
