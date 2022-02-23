
public class Account {
	private int accountNumber;
	private double balance = 0.0;
	
	public Account(int accountNumber,double balance){
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public Account(int accountNumber){
		this.accountNumber = accountNumber;
	}
	
	public int getAccountNumber() {
		return this.accountNumber;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public void setBalance(double balance) {
		if(balance>0) {
			this.balance = balance;
		}
	}
	
	public void credit(double amount) {
		if(amount>0) {
			this.balance += amount;
		}
	}
	
	public void debit(double amount) {
		if(amount<=this.balance) {
			this.balance -= amount;
		}else {
			System.out.println("Amount withdraw exceeds the current balance!");
		}
	}
	
	public String toString() {
		return "A/C no:"+this.accountNumber+", Balance=$"+this.balance;
	}

}
