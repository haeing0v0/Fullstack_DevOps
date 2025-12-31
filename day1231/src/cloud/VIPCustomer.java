package cloud;

public class VIPCustomer extends Customer {
	private int agentID;
	double saleRatio;
	
	public VIPCustomer() {
		//super("SILVER", 0.01); //부모 생성자, 무조선 첫 라인에 정의
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		
		System.out.println("VIPCustomer() 생성자 호출");
	}

	public int getAgentID() {
		return agentID;
	}
	
	@Override
	//자식 클래스가 부모 클래스가 가진 메서드를 재사용하는 것이 오버라이드이다.
	public int calcPrice(int price) { 
		return 100;
	}
}
