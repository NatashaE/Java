package edu.tridentech.cpt187.edwards.program6;


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class PayrollManager 
{
	private String outputFile;
	
	PayrollManager(String fileName)
	{
		outputFile = fileName;
	}
	
	public void saveOneRecord(int idNum, double hours, double pay)
	{
		try
			{
				PrintWriter myPW = new PrintWriter (new FileWriter(outputFile, true));
				
				myPW.printf ("%s %s $%.2f\n", idNum, hours, pay);
				myPW.close();
					
			}
			catch (IOException ex)
			{
				ex.printStackTrace();
			}		
	}
}
