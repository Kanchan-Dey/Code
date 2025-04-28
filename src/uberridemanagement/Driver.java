package uberridemanagement;

public class Driver extends User{
private boolean available=true;
Driver(String id,String name)
{
	super(id,name);
	setAvailable(this.available);
}
public void setAvailable(boolean available)
{
	this.available=available;
}
public boolean isAvailable()
{
	return available;
}
void showProfile()
{
	System.out.println("Driver name"+ " " + this.name + "is available: " + isAvailable());
}
}
