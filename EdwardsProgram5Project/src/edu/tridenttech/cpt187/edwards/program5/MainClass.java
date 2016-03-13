package edu.tridenttech.cpt187.edwards.program5;


public class MainClass 
{

	public static void main(String[] args) 
	{
		ListOfInts numberGames = new ListOfInts();
		
		numberGames.loadArray();
		System.out.println("The elements of the array are: ");
		numberGames.displayArray();
		System.out.println("\nThe average of the array elements is: "+numberGames.calcAverage());
		System.out.println("The number of elements above the average is : "+numberGames.countAboveAvg());
		System.out.println("The smallest integer in the array is: "+numberGames.findMinInteger());

	}

}
