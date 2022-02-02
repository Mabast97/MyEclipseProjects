package Serializable;

import java.io.Serializable;

/* A serialized object
is an object represented as a sequence of bytes that includes the object’s data as well as
information about the object’s type and the types of data stored in the object.
*/

public class Account implements Serializable{
	
	// Serializable Account class for storing records as objects.
	private int account;
	private String firstName;
	private String lastName;
	private double balance;
	
	public Account ()
	{
		this(0, "", "", 0);
	}

	public Account(int account, String firstName, String lastName, double balance) {
		this.account = account;
		this.firstName = firstName;
		this.lastName = lastName;
		this.balance = balance;
	}
	
	// set account number
	public void setAccount(int acct)
	{
	this.account = account;
	 }
		// get account number
	public int getAccount()
	{
	return account;
	}
		// set first name
	public void setFirstName(String firstName)
	{
	this.firstName = firstName;
	}
		// get first name
	public String getFirstName()
	{
	return firstName;
	}
		// set last name
	public void setLastName(String lastName)
	{
	this.lastName = lastName;
	}
		// get last name
	public String getLastName()
	{
	return lastName;
	}
	// set balance
	public void setBalance(double balance)
	{
	this.balance = balance;
	}
		 // get balance
	public double getBalance()
	{
	return balance;
	}
	
} // Account
