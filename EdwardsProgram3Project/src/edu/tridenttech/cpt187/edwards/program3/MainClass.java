package edu.tridenttech.cpt187.edwards.program3;

public class MainClass 
{

	public static void main(String[] args)
	{
		int maxRiders;
		int lowestFloor;
		int highestFloor;
		int curntFloor;
		int requestedFloor;
		int numLoad;
		int numUnLoad;

		Elevator RideIt = new Elevator(18, 1, 99,1);
		
		numLoad = 19;
		maxRiders = RideIt.getMaxCapacity();
		RideIt.getNumOnBoard();
		RideIt.loadElevator(numLoad, maxRiders);
		highestFloor = RideIt.getMaxFloor();
		lowestFloor = RideIt.getMinFloor();
		curntFloor = RideIt.getCurrentFloor();
		requestedFloor = 5;
		RideIt.getDestFloor();
		RideIt.moveElevator(requestedFloor, highestFloor, lowestFloor, curntFloor);
		numUnLoad = 15;
		maxRiders = RideIt.getMaxCapacity();
		RideIt.unLoadElevator(numUnLoad, maxRiders);
		numLoad = 1;
		maxRiders = RideIt.getMaxCapacity();
		RideIt.getNumOnBoard();
		RideIt.loadElevator(numLoad, maxRiders);
		highestFloor = RideIt.getMaxFloor();
		lowestFloor = RideIt.getMinFloor();
		curntFloor = RideIt.getCurrentFloor();
		requestedFloor = 5;
		RideIt.getDestFloor();
		RideIt.moveElevator(requestedFloor, highestFloor, lowestFloor, curntFloor);
		requestedFloor = 7;
		RideIt.getDestFloor();
		RideIt.moveElevator(requestedFloor, highestFloor, lowestFloor, curntFloor);
		numUnLoad = 5;
		maxRiders = RideIt.getMaxCapacity();
		RideIt.unLoadElevator(numUnLoad, maxRiders);
		numLoad = 10;
		maxRiders = RideIt.getMaxCapacity();
		RideIt.getNumOnBoard();
		RideIt.loadElevator(numLoad, maxRiders);
		highestFloor = RideIt.getMaxFloor();
		lowestFloor = RideIt.getMinFloor();
		curntFloor = RideIt.getCurrentFloor();
		requestedFloor = 105;
		RideIt.getDestFloor();
		RideIt.moveElevator(requestedFloor, highestFloor, lowestFloor, curntFloor);
		requestedFloor = 35;
		RideIt.getDestFloor();
		RideIt.moveElevator(requestedFloor, highestFloor, lowestFloor, curntFloor);
		numUnLoad = 3;
		maxRiders = RideIt.getMaxCapacity();
		RideIt.unLoadElevator(numUnLoad, maxRiders);
		numLoad = 1;
		maxRiders = RideIt.getMaxCapacity();
		RideIt.getNumOnBoard();
		RideIt.loadElevator(numLoad, maxRiders);
		highestFloor = RideIt.getMaxFloor();
		lowestFloor = RideIt.getMinFloor();
		curntFloor = RideIt.getCurrentFloor();
		requestedFloor = 24;
		RideIt.getDestFloor();
		RideIt.moveElevator(requestedFloor, highestFloor, lowestFloor, curntFloor);
		numUnLoad = 15;
		maxRiders = RideIt.getMaxCapacity();
		RideIt.unLoadElevator(numUnLoad, maxRiders);
		numLoad = 5;
		maxRiders = RideIt.getMaxCapacity();
		RideIt.getNumOnBoard();
		RideIt.loadElevator(numLoad, maxRiders);
		highestFloor = RideIt.getMaxFloor();
		lowestFloor = RideIt.getMinFloor();
		curntFloor = RideIt.getCurrentFloor();
		requestedFloor = 99;
		RideIt.getDestFloor();
		RideIt.moveElevator(requestedFloor, highestFloor, lowestFloor, curntFloor);
	}
}
	