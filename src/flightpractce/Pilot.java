package flightpractce;

public class Pilot {
public static void main(String[] args) {
	Flight flight = new Flight("A123");
	Passenger p = new Passenger("kanchan");
	flight.addPassengers(p);
	Flight flight1 = new Flight("B456");
	Passenger p1 = new VipPassenger("Kunal is way too rich for this shit");
	flight1.addPassengers(p1);
	flight1.addPassengers(p1);
	flight.showPassengers();
	flight1.showPassengers();
}
}
