package exam.ex10;

public class Ex10 {

	public static void main(String[] args) {
		//알파벳 소문자를 2글자씩 13줄(13행, 2열)로 출력하는 프로그램을 2차원 배열로 구현하시오.
		
		char[][] alphabet = new char[13][2]; //행, 열
		char ch = 'a';
		
		for (int i = 0; i < alphabet.length; i++) {
			for (int j = 0; j < alphabet.length; j++) {
				alphabet[i][j] = ch;
				System.out.print(alphabet[i][j] + " ");
				ch++;
			}System.out.println();
		}
	}
}
