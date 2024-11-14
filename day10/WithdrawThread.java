package day10;

public class WithdrawThread extends Thread {
		private Account account;
		private Object amount;
		
		public WithdrawThread(Account account) {
			this.account = account;
		}
		@Override
		public void run() {
			for(int i=0; i<5; i++) {
				account.deposit(150);
				try {
					Thread.sleep(2000);
				}catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
		}
}
