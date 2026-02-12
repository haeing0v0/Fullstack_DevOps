package BookP208_9.ex06;

public class Ex06 {
	//카드 회사에서 카드를 발급할 때마다 카드 고유 번호를 부여해줍니다.
	//카드가 생성될 때마다 카드 번호가 자동으로 1씩 증가할 수 있도록 카드 클래스를 만들어 프로그래밍해보세요.
	
	public static void main(String[] args) {
		CardCompany com = CardCompany.getInstance();
		
		Card myCard1 = com.createCard();
		Card myCard2 = com.createCard();
		
	    System.out.println(myCard1.getCardNumber());
	    System.out.println(myCard2.getCardNumber());
	}
}
