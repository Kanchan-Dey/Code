package interfacetask;

abstract public class AbstractVehicle implements Vehicle{
  protected String name;
  protected int speed;
  public AbstractVehicle(String name,int speed)
  {
	  this.name=name;
	  this.speed=speed;
  }
  public void displayDetails()
  {
	  System.out.println(this.name);
	  System.out.println(this.speed);
  }
  public void accelerate(int increement)
  {
	  this.speed+=increement;
	  System.out.println(this.name +" " + "accelerated car speed:"+ " "+ this.speed);
  }
  public void brake(int decreement)
  {
	  this.speed-=decreement;
	  System.out.println(this.name+" "+"decreasing car speed"+ " "+this.speed);
  }
  public int getCurrentSpeed()
  {
	  return this.speed;
  }
  
}
