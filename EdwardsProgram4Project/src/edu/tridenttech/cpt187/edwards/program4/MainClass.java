package edu.tridenttech.cpt187.edwards.program4;

public class MainClass
{

	public static void main(String[] args) 
	{ 
		final int totalStations = 30;
		final int maxNumPersons = 200;
		final int departStation = 1;
		
		
		SubwayTrain dayTripper = new SubwayTrain (totalStations, maxNumPersons, departStation);
		
		System.out.println("All aboard the Daytripper Subway!\n");
		dayTripper.getPeopleOnBoard();
		dayTripper.loadPeople();
		for (int ct = 0; ct < totalStations; ++ct)
		{
			dayTripper.moveToStation(dayTripper.getCurrentStation() + 1);
			dayTripper.unloadPeople();
			dayTripper.loadPeople();
		}
		dayTripper.moveToStation(dayTripper.getCurrentStation());
	}

}
