package cloud;

public class CustomerRun1 {
	public static void main(String[] args) {
		
		Customer custo = new Customer();
		VIPCustomer vipCusto = new VIPCustomer();

		vipCusto.setCustomerID(10020);
		vipCusto.setCustomerName("김유신");
		vipCusto.setBonusPoint(10000);
		
		int customerID = vipCusto.getCustomerID();
		String customerName = vipCusto.getCustomerName();
		int bonusPoint = vipCusto.getBonusPoint();
		String customerGrade = vipCusto.getCustomerGrade();
		int calcPrice = vipCusto.calcPrice(bonusPoint);
		
		System.out.println(customerName + "님의 등급은 " + customerGrade + 
				"이며, 보너스 포인트는 " + bonusPoint + "입니다.");
		System.out.println("VIPCustomer.calcPrice = " + calcPrice);
		
		Customer vCusto = new VIPCustomer(); //자동 형변환
		
		int calcPri = vCusto.calcPrice(calcPrice);
		
		System.out.println("Customer.calcPrice = " + calcPri);
	}
}
