package edu.tridentech.cpt187.edwards.program6;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class EmployeePayData {

	private int[] idNum = new int [200];
	private double[] payRate = new double [200];
	private int idCount = 0;
	
	EmployeePayData()
	{
		
	}
	
	public void loadArrays()
	{
		idCount = 0;
		try 
		{
			String filename = "employeePay.dat";
			Scanner infile = new Scanner (new FileInputStream(filename));
			
			while(infile.hasNext())
			{
				idNum[idCount] = infile.nextInt();
				payRate[idCount] = infile.nextDouble();
				++idCount;
			}
			infile.close();
		} 
		catch (IOException ex) 
		{
			idCount = -1;
			ex.printStackTrace();
		}
	}
	
	public int seqSearch(int target)
	{
		int ind = 0;
		int found = -1;
		int counter = 0;
		
		while(ind<idCount)
		{
			counter++;
			if(target==idNum[ind])
			{
				found=ind;
				ind=idCount;
			}
			else
			{
				++ind;
			}
			
		}
		System.out.println("Sequential Counter: " +counter);
		return found;
	}
	
	public int binSearch(int target)
	{
		int first = 0;
		int last = idCount - 1;
		int found = 0;
		int mid = 0;
		int counter = 0;
		while (first <= last && found==0)
		{
			counter++;
			mid = (first + last)/2;
			if (idNum[mid] == target)
			{
				found = 1;
			}
			else if (idNum[mid]<target)
			{
				first = mid + 1;
			}
			else
			{
				last = mid - 1;
			}
		}	
			
		if(found == 0)
		{
			mid = -1;
		}
			
		System.out.println("Binary Counter: " +counter);
		return mid;
		
	}
	
	
	public double getPayRate(int index)
	{
		if (index >= 0 && index < idCount)
			return payRate[index];
		else
			return -1;
	}
}
