package interface3;

public class CustomerRun {

	public static void main(String[] args) {
		
		Customer cust = new Customer();
		cust.buy();
		cust.sell();
		
//		========================= 위아래 같음
		
		Buy buy = new Customer();
		Sell sell = new Customer();
		buy.buy();
		sell.sell();

	}
}
