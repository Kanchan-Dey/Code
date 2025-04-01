package interfacetask;

public class Car extends AbstractVehicle{
  public Car(String name,int speed)
  {
	 super(name,speed);
  }
 public void start()
  {
	  System.out.println("car is starting");
  }
 public void stop()
 {
	 System.out.println("car is stopping");
 }
@Override
public void displayType() {
	// TODO Auto-generated method stub
	System.out.println("CAR");
}
 
 
}
