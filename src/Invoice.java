

public class Invoice {

	private static double annualInterestRate;
	private double savingsBalance;
	
	public Invoice(double balance, double intRate)
	{
		savingsBalance = checkBalance(balance);
		annualInterestRate = (intRate / 100);
	}
	
	private double checkBalance(double balance)
	{
		if (balance < 0)
		{
			System.out.println("Wrong Balance, (Balance) set to 1");
			return 1;
		}
		else 
			return balance;
	}
	
	public double monthlyInterest()
	{
		double result = (savingsBalance * annualInterestRate ) / 12 ;
		
		return result;
	}
	
	public static double modifyIntRate(double value)
	{
		return value;
	}
	
	public String toString()
	{
		String s = "Annual Interest Rate is : "+annualInterestRate+"\nSavingsBalance is : "+savingsBalance+
				"\nmonthly Interest Rate is : "+monthlyInterest();
		return s;
	}

	} // end of Class

