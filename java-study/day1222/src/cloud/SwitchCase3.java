package cloud;

public class SwitchCase3 {

	public static void main(String[] args) {

		int ranking = 1;
		char medalColor;
		
		switch (ranking) {
			case 1:
				medalColor = '금';
				System.out.println("메달의 색: " + medalColor + "메달");
				break;
				
			case 2:
				medalColor = '은';
				System.out.println("메달의 색: " + medalColor + "메달");
				break;
				
			case 3:
				medalColor = '동';
				System.out.println("메달의 색: " + medalColor + "메달");
				break;
				
			default:
				System.out.println("메달이 없습니다.");
				break;
		}

	}
}
