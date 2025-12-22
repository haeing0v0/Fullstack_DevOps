package exam;

public class T02 {

	public static void main(String[] args) {

		char grade = 'B';
		
		switch (grade) {
		case 'A', 'a':
			System.out.println("A등급은 우수회원입니다.");
			break;
		
		case 'B', 'b':
			System.out.println("B등급은 일반회원입니다.");
			break;
			
		default:
			System.out.println("손님입니다.");
			break;
		}

	}

}
