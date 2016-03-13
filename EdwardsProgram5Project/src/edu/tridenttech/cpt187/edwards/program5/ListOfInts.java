package edu.tridenttech.cpt187.edwards.program5;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;


public class ListOfInts 
{
	private int[] intList = new int [99];
	private int intCount = 0;
	
	ListOfInts()
	{
		
	}
	
	public void loadArray()
	{
		intCount = 0;
		try 
		{
			String filename = "program5.dat";
			Scanner infile = new Scanner (new FileInputStream(filename));
			
			while(infile.hasNext())
			{
				intList[intCount] = infile.nextInt();
				++intCount;
			}
			infile.close();
		} 
		catch (IOException ex) 
		{
			intCount = -1;
			ex.printStackTrace();
		}
	}
	
	public void displayArray()
	{
		for(int i = 0; i < intCount; i++)
		{
			if (i % 10 == 0 && i > 0) 
			{
	            System.out.println();
	        }
			System.out.print(intList[i] + " ");
			
		}
	}
	
	public double calcAverage()
	{
		int sum = 0;
		for(int i = 0; i< intCount; i++)
		{
			sum += intList[i];
		}
		double average = sum / intList.length;
		return average;
	}
	
	public int countAboveAvg()
	{
		int count = 0;
		for(int i = 0; i < intCount; i++)
		{
			if(intList[i] > calcAverage())
			{
				count++;
			}
		}
		return count;
	}
	
	public int findMinInteger()
	{
		int min;
		min = intList[0];
		for(int i=1;i<intCount;i++)
		{
			if(intList[i] < min)
			{
				min = intList[i];
			}
		}
		return min;
	}

}
