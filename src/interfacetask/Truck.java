package interfacetask;

public class Truck extends AbstractVehicle{
  public Truck(String name,int speed)
  {
	 super(name,speed);
  }
 public void start()
  {
	  System.out.println("Truck is starting");
  }
 public void stop()
 {
	 System.out.println("Truck is stopping");
 }
@Override
public void displayType() {
	// TODO Auto-generated method stub
	System.out.println("TRUCK");
}
 
 
}
