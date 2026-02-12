package BookP208_9.ex06;

public class Card {
	private static int serialNum = 10000;
	private int cardNumber;
	
	public Card() {
		serialNum++;
		cardNumber = serialNum;
	}
	
	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}

	public int getCardNumber() {
		return cardNumber;
	}
}
