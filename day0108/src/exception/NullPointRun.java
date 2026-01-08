package exception;

public class NullPointRun {
	public static void main(String[] args) {
		
		try {
			String data = null;
			System.out.println(data.toString());
		} catch (NullPointerException e) { //구체적 예외는 먼저 적어줘야 함
			//e.printStackTrace();
			System.out.println("예외가 발생했습니다." + e);
		} catch (Exception e) { //Exception : 모든 예외
			// TODO: handle exception
		}
	}
}