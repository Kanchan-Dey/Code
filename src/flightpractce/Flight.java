package flightpractce;

import java.util.ArrayList;
import java.util.List;

public class Flight<Passenger> {
private String flightNumber;
private List<Passenger> passengers;
Flight(String flightNumber)
{
	setFlightNumber(flightNumber);
	this.passengers= new ArrayList<Passenger>();
}
void setFlightNumber(String flightNumber)
{
	this.flightNumber=flightNumber;
}
String getFlightNumber()
{
	return flightNumber;
}
public void addPassengers(Passenger passenger)
{
	this.passengers.add(passenger);
	
}
public void showPassengers()
{
	System.out.println(this.passengers);
}
}
