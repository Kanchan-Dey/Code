package interfacetask;

public class Bike extends AbstractVehicle{
  public Bike(String name,int speed)
  {
	 super(name,speed);
  }
 public void start()
  {
	  System.out.println("Bike is starting");
  }
 public void stop()
 {
	 System.out.println("Bike is stopping");
 }
@Override
public void displayType() {
	// TODO Auto-generated method stub
	System.out.println("BIKE");
}
 
 
}

