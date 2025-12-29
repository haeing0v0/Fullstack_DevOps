package BookP208_9.ex06;

public class CardCompany {
	private CardCompany() {} 
	
	//싱글톤~~
	private static CardCompany instance = new CardCompany();
	
	public static CardCompany getInstance() {
		if(instance == null) {
			instance = new CardCompany();
		}
		
		return instance;
	}
	//~~싱글톤
	
	public Card createCard()  {
		Card card = new Card();
		
		return card;
	}
}
