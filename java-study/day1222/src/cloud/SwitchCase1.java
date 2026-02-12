package cloud;

public class SwitchCase1 {
	public static void main(String[] args) {
		
		int age = 10;
		
		switch (age) {
		case 5:
			System.out.println("유치원에 다닙니다.");
			break;
			
		case 10:
			System.out.println("초등학교에 다닙니다.");
			break;
		
		case 15:
			System.out.println("중학교에 다닙니다.");
			break;

		default:
			System.out.println("고등학교에 다닙니다.");
			break;
		}
	}
}
