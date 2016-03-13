
//FILE: SavingsAccount.java
//PROG: Natasha Edwards
//PURP: Simulate a simple bank savings account that allows deposits and withdrawals

package edu.tridenttech.cpt187.edwards.program2;

public class SavingsAccount 
{
	private String accountNumber;
	private double balance;
	private double rate;
	
	public SavingsAccount(String acctNo, double startingBalance, double startingRate)
	{
		accountNumber = acctNo;
		balance = startingBalance;
		rate = startingRate;
		
	}
	
	public String getAccountNumber()
	{
		return accountNumber;
	}
	
	public double getBalance()
	{		
		return balance;
	}
	
	public double getRate()
	{
		return rate;
	}
	
	public void setAccountNumber(String newAcctNum)
	{
		accountNumber = newAcctNum;
	}
	
	public void setRate(double rate, double newIntRate)
	{
		rate = newIntRate;
	}
	
	public void addToBalance(double amount)
	{
		balance += amount;
	}
	
	public void withdrawFromBalance(double withdrawAmount)
	{
		balance -= withdrawAmount;
	}
}
