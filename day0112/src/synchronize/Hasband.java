package synchronize;

public class Hasband extends Thread {

	@Override
	public void run() {
		
		synchronized (BankSyncRun.myBank) {
			System.out.println("예금을 시작합니다.");
			BankSyncRun.myBank.saveMoney(3000);
			
			System.out.println("saveMoney(3000) 작업이 진행되어 잔액이 "
			+ BankSyncRun.myBank.getMoney() + "원입니다.");
		}
	}
}
