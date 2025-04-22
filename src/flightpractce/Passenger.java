package flightpractce;

public class Passenger {
private String name;
Passenger(String name)
{
	setName(name);
}
public void setName(String name)
{
	this.name=name;
}
public String getName()
{
	return name;
}
public String toString()
{
	return "Poor economy " +getName();
	
}
}
