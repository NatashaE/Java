package edu.tridentech.cpt187.edwards.program6;

import java.util.Scanner;

public class MainClass 
{
	
	public static void main(String[] args) 
	{
		EmployeePayData checkMyPay = new EmployeePayData();
		Scanner myScanner = new Scanner(System.in);
		int target;
		double payRate;
		double hoursWorked;
		double totalPay;
		int counter = 0;
		int forCounter = 0;
		int notCounter = 0;
		
		checkMyPay.loadArrays();
		checkMyPay.bubbleSort();
		
		System.out.println("Welcome! The purpose of this program is to compute the amount of pay for one pay period for each employee found.");
		System.out.println("Please enter employee ID number to start or enter 9 to quit:");
		target=myScanner.nextInt();
		while(target != 9)
		{
			counter++;
			int index = checkMyPay.seqSearch(target);
			
			if(index != -1)
			{
				payRate = checkMyPay.getPayRate(index);
				System.out.printf("Sequential found employee %d, and the pay rate is $%.2f per hour.", target, payRate);
			}
			else
			{
				System.out.printf("Invalid!! Sequential did not find ID number "+target+".%n");
			}
			
			int indexOther = checkMyPay.binSearch(target);
			if(indexOther != -1)
			{
				payRate = checkMyPay.getPayRate(indexOther);
				System.out.printf("\nBinary found employee %d, and the pay rate is $%.2f per hour.", target, payRate);
				System.out.println("\nEnter the hours the employee worked:");
				hoursWorked=myScanner.nextDouble();
				totalPay=checkMyPay.getPayEarned(hoursWorked, indexOther);
				System.out.printf("%n%-10s %-10s %-10s %-10s", "EMP ID", "Rate", "HRS", "Pay");
				System.out.printf("%n%-10d $%-10.2f %-10.2f $%-10.2f %n", target, payRate, hoursWorked, totalPay);
				forCounter++;
			}
			else
			{
				System.out.println("Invalid!! Binary did not find ID number "+target+".");
				notCounter++;
			}
			System.out.println("\nPlease enter employee ID number or 9 to quit:");
			target=myScanner.nextInt();
		}
		System.out.println("\nEmployee ID search results:");
		System.out.printf("%n%-15s %-15s %-15s", "# Searched", "# Found", "# Invalid");
		System.out.printf("%n%-15d %-15d %-15d", counter, forCounter, notCounter);
		myScanner.close();
	}
}
