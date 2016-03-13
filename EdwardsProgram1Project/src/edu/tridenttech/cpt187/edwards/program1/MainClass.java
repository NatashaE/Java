//FILE: MainClass.java
//PROG: Natasha Edwards
//PURP: Simulate a real bank savings account using the class SavingAccount


package edu.tridenttech.cpt187.edwards.program1;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner (System.in);
		
		String firstName = "";
		double amount = 0.0;
		double withdrawAmount;
		
		SavingsAccount myAccount = new SavingsAccount();

		
		System.out.println("Welcome to the savings account banking tool!");
		System.out.println("Please enter your first name: ");
		firstName = input.nextLine();
		
		System.out.println("Hello " + firstName + ", how much will the account balance start at?");
		amount = input.nextDouble();
		amount = myAccount.getBalance();
		myAccount.addToBalance(amount);
		
		
		System.out.println("Ok, " + firstName + ", how much would you like to withdrawal?");
		withdrawAmount = input.nextDouble();
		myAccount.withdrawFromBalance(withdrawAmount);

		
		System.out.println("The initial balance in this account is $" + amount);
		System.out.println("The amount withdrawn from this account is $"  + withdrawAmount);
		System.out.println("The new balance after deposit is $" + myAccount.getBalance());
		System.out.println("Thank you, " + firstName + ". Have a great day!");
	
		input.close();
	}



}
