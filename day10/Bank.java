package day10;

public class Bank {
	public static void main(String[] args) {
		Account account = new Account();
		
		DepositThread depositThread = new DepositThread(account);
		WithdrawThread withdrawThread = new WithdrawThread(account);
		
		depositThread.start();
		withdrawThread.start();
		
	}

}
