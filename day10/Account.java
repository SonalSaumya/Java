package day10;

public class Account {
	private double balance = 0;
	
	
	
	public synchronized void deposit(double amount) {
		balance += amount;
		
		System.out.println("Deposited: " + amount + ", New Balance: " + balance);
		notify();
	}
	
	
	
	public synchronized void withdraw (double balance) {
		double amount = 0;
		while (balance < amount) {
			try {
				System.out.println("Insufficient funds");
				wait();
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		balance -= amount;
		System.out.println("Withdraw: " + amount + ", New Balance: " + balance);
	}
	
}
