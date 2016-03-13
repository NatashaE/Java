package edu.tridenttech.cpt187.edwards.program4;

import java.util.Random;

public class SubwayTrain 
{
	private int peopleOnBoard;
	private int maxCapacity;
	private int currentStation;
	private int numStations;
	private int destStation;
	private int numPeople;
	private Random ranNumGenerator;
	
	public SubwayTrain(int totalStations, int maxPersons, int startStation)
	{
		numStations = totalStations;
		maxCapacity = maxPersons;
		currentStation = startStation;
		destStation = currentStation;
		peopleOnBoard = 0;
		numPeople = 300;
		ranNumGenerator = new Random();
	}
	
	public int getPeopleOnBoard()
	{
		return peopleOnBoard;
	}
	
	public int getmaxCapacity()
	{
		return maxCapacity;
	}
	
	public int getCurrentStation()
	{
		return currentStation;
	}
	
	public int getNumStations()
	{
		return numStations;
	}
	
	public int getDestStation()
	{
		return destStation;
	}
	
	public int genRandNumber(int maxNum)
	{
		return ranNumGenerator.nextInt(maxNum + 1);
	}
	
	public void moveToStation(int nextStation)
	{
		if (destStation <= numStations)
		{
			destStation = nextStation;
			
			System.out.printf("Leaving station #%d for station #%d with %d passengers.\n",
				currentStation, destStation, peopleOnBoard);
		
			currentStation = destStation;
		}
		else
		{
			System.out.println("An error has occurred!!");
		}
		
	}
	
	public void unloadPeople()
	{
		final int unloadPeople = genRandNumber(numPeople);
		
		if (peopleOnBoard >= unloadPeople)
		{
			peopleOnBoard -= unloadPeople;
		}
		else 
		{
			peopleOnBoard = 0;
		}
	}
	
	public void loadPeople()
	{
		final int loadPeople = genRandNumber(numPeople);
		final int remainingPeople = maxCapacity - peopleOnBoard;
		
		if (remainingPeople >= loadPeople )
		{
			peopleOnBoard += loadPeople;
		}
		else 
		{
			System.out.println("Too many people trying to board, only the allowed amount can board!!");
			peopleOnBoard += remainingPeople;
		}
	}
}
