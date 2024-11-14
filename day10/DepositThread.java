package day10;

public class DepositThread extends Thread {
	private Account account;
	private Object amount;
	
	public DepositThread(Account account) {
		this.amount = amount;
	}
	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			account.deposit(100);
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}
