
public class Account {
	private double balance;
	
	public Account(double initialBalance){
		if(balance >= 0)
			balance = initialBalance;
	}
	
	public void deposit (double amount)
	{
		balance += amount;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public void withdraw(double amount)
	{
		if (balance <= amount) {
			System.out.println("You don't have enough balance which is : "+balance);
		}else {
			balance -= amount;
			System.out.println("Now your balance is : "+balance);
		}
	}

}
