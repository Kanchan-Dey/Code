package flightpractce;

public class VipPassenger extends Passenger {
	private String name;
VipPassenger(String name)
{
	super(name);
}
public String toString()
{
	return "VIP"+" "+super.getName();
}
}
