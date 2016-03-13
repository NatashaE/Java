//FILE: MainClass.java
//PROG: Natasha Edwards
//PURP: Simulate a real bank savings account using the class SavingAccount


package edu.tridenttech.cpt187.edwards.program2;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner (System.in);
		
		String firstName = "";
		double amount;
		double withdrawAmount;
		int month;
		double startingBalance;
		double endBalance;
		double interestEarned;
		double startingRate;
		
		SavingsAccount myAccount = new SavingsAccount("Z1234A", 5000.00, .003);

		
		System.out.println("Welcome to the savings account banking tool!");
		System.out.println("Please enter your first name: ");
		firstName = input.nextLine();
		
		System.out.printf("Hello " + firstName + ", your account number is: " + myAccount.getAccountNumber() + " and balance is: $%.2f.", + myAccount.getBalance() );
		System.out.printf("%nPlease enter an amount you would like to deposit. Enter 0 if no deposit.");
		amount = input.nextDouble();
		myAccount.addToBalance(amount);
		
		System.out.println("Please enter the amount you would like to withdrawal. Enter 0 if no withdraw.");
		withdrawAmount = input.nextDouble();
		myAccount.withdrawFromBalance(withdrawAmount);

		System.out.printf(firstName + ", your balance is: $%.2f.\n", + myAccount.getBalance());
		System.out.printf ("%10s%15s%15s%15s\n", "Month #", "Start Bal", "Int Earned", "End Bal");
		month = 0;
		startingBalance = myAccount.getBalance();
		startingRate = myAccount.getRate();
		
		while (month < 12)
		{
		month += 1;
		interestEarned = startingBalance * startingRate;
		endBalance = startingBalance + interestEarned;
		System.out.printf ("%10s%15.2f%15.2f%15.2f\n", month, startingBalance, interestEarned, endBalance);
		startingBalance = endBalance;
		}
		
		input.close();
	}

	public static void applyInterest (SavingsAccount theAccount)
	{
		double currentBalance = theAccount.getBalance();
		double currentRate = theAccount.getRate();
		double interestEarned = currentBalance * currentRate;
		theAccount.addToBalance(interestEarned);
	}
	
	
}
