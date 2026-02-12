package cloud;

public class GoldCustomer extends Customer {
	
	private int agentID;
	double saleRatio;
	
	public GoldCustomer() {
		customerGrade = "GOLD";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		System.out.println("GoldCustomer() 생성자 호출");
	}
	
	public int getAgentID() {
		return agentID;
	}
	
	@Override
	public int calcPrice(int price) {
		return 10;
	}
}