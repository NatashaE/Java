package edu.tridentech.cpt187.edwards.program6;

import java.util.Scanner;

public class MainClass 
{
	
	public static void main(String[] args) 
	{
		EmployeePayData checkMyPay = new EmployeePayData();
		Scanner myScanner = new Scanner(System.in);
		int target;
		
		checkMyPay.loadArrays();
		
		System.out.println("Please enter employee ID number or 9 to quit:");
		target=myScanner.nextInt();
		while(target != 9)
		{
			int index = checkMyPay.seqSearch(target);
			
			if(index != -1)
			{
				
				System.out.printf("Sequential found employee %d, and the pay rate is $%.2f per hour.%n", target, checkMyPay.getPayRate(index));
			}
			else
			{
				System.out.printf("Sequential did not find ID number "+target+".\n");
			}
			
			index=checkMyPay.binSearch(target);
			if(index != -1)
			{
				
				System.out.printf("Binary found employee %d, and the pay rate is $%.2f per hour.", target, checkMyPay.getPayRate(index));
			}
			else
			{
				System.out.println("\nBinary did not find ID number "+target+".");
			}
			System.out.println("\nPlease enter employee ID number or 9 to quit:");
			target=myScanner.nextInt();
		}
		myScanner.close();
	}

}
