package interfaceabstractionpractice;

abstract public class AbstractVehicle implements Vehicle{
protected String name;
protected int speed;
AbstractVehicle(String name,int speed)
{
	this.name=name;
	this.speed=speed;
}
protected void displayDetails()
{
	System.out.println(this.name + " "+ this.speed);
}
public void accelerate(int increement) {
	System.out.println(this.speed + increement);
}

public void brake(int decreement) {
	System.out.println(this.speed - decreement);
}
protected void getCurrentSpeed()
{
	System.out.println(this.speed);
}
}
