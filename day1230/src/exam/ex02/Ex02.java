package exam.ex02;

public class Ex02 {

	public static void main(String[] args) {
		
		//217쪽의 알파벳을 출력하는 예제에서 각 배열 요솟값을 대문자에서 소문자로 변환해 출력하세요.
		char[] alphabets = new char[26];
		char ch = 'A';
		
		for (int i = 0; i < alphabets.length; i++, ch++) {
			alphabets[i] = ch;
			System.out.print(", " + alphabets[i]);
		}
		
		System.out.println();
		
		for (int i = 0; i < alphabets.length; i++) {
			alphabets[i] += 32;
			System.out.print(", " + alphabets[i]);
		}

	}

}