package BookP208_9.ex07;

public class Ex07 {
	//Ex06에서 구현한 내용에 싱글톤 패턴을 사용하여 카드 회사 클래스 CardCompany를 구현해보세요.
	
	private Ex07() {}
	
	private static Ex07 instance = new Ex07();

	public static Ex07 getInstance() {
		
		if (instance == null) {
			instance = new Ex07();
		}
		return instance;
	}
}
