package edu.tridenttech.cpt187.edwards.program3;

public class Elevator 
{

	private int numOnBoard;
	private int maxCapacity;
	private int currentFloor;
	private int destFloor;
	private int maxFloor;
	private int minFloor;
	
	public Elevator(int maxRiders, int curntFloor, int highestFloor, int lowestFloor)
	{
		maxCapacity = maxRiders;
		currentFloor = curntFloor;
		maxFloor = highestFloor;
		minFloor = lowestFloor;
		numOnBoard = 0;
		destFloor = currentFloor;
	}

	public int getNumOnBoard()
	{
		return numOnBoard;
	}
	
	public int getMaxCapacity()
	{
		return maxCapacity;
	}
	
	public int getCurrentFloor()
	{
		return currentFloor;
	}

	public int getDestFloor()
	{
		return destFloor;
	}
	
	public int getMaxFloor()
	{
		return maxFloor;
	}
	
	public int getMinFloor()
	{
		return minFloor;
	}
	
	public void loadElevator(int numLoad, int maxRiders)
	{
		maxRiders = maxCapacity;
		//maxCapacity = maxRiders;
		if (numLoad > maxCapacity)
		{
			numLoad = maxCapacity;
			numOnBoard += numLoad;
		}
		else if ((numLoad + numOnBoard) > maxCapacity)
		{
			numLoad = maxCapacity;
			numOnBoard += numLoad;
		}
		else
		{
			numOnBoard += numLoad;
		}
	
		System.out.println(numLoad+ " people are getting on the elevator.");
		System.out.println(numOnBoard + " people are currently on the elevator.");
	}
	
	public void unLoadElevator(int numUnLoad, int maxRiders)
	{
		maxCapacity = maxRiders;
		if (numUnLoad > maxCapacity)
		{
			numUnLoad = maxCapacity;
			numOnBoard -= numUnLoad;
		}
		else if (numUnLoad > numOnBoard)
		{
			numUnLoad = numOnBoard;
			numOnBoard -= numUnLoad;
		}
		else 
		{
			numOnBoard -= numUnLoad;;
		}
		System.out.println(numUnLoad + " people are leaving the elevator." );
	}
	
	public void moveElevator(int requestedFloor, int highestFloor, int lowestFloor, int curntFloor)
	{
		
		destFloor = requestedFloor;
		if (requestedFloor == currentFloor)
		{
			System.out.println("Can't go there!");
		}
		else if (requestedFloor > maxFloor)
		{
			System.out.println("Can't go there!");
		}
		else if (requestedFloor < minFloor)
		{
			System.out.println("Can't go there!");
		}
		else if (destFloor > currentFloor)
		{
			System.out.println("Going up from floor " + currentFloor);
			while (currentFloor < (destFloor - 1))
			{
				currentFloor ++;
				System.out.println("Passing floor " + currentFloor);
			}
				currentFloor++;
				System.out.println("Made it to floor " + currentFloor);
		}
		else
		{
			System.out.println("Going down from floor " + currentFloor);
			while (currentFloor > (destFloor + 1))
			{
				currentFloor--;
				System.out.println("Passing floor " +currentFloor);
			}
			currentFloor--;
			System.out.println("Made it to floor " + currentFloor);
		}
	}
		
	
}
