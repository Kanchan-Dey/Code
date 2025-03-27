package inheritancetask;

public class Bike extends Vehicle{
 private boolean hasGear;
 public Bike(String vehicleNumber,String brand,String model,double rentalpriceperDay,boolean isAvailable,boolean hasGear) {
	 super(vehicleNumber,brand,model,rentalpriceperDay,isAvailable);
	 this.hasGear=hasGear;
 }
 public void displayDetails()
 {
	 super.displayDetails();
	 if(this.hasGear)
	 {
		 System.out.println("Bike has gear");
	 }
	 else
	 {
		 System.out.println("Bike doesnt have gear");
	 }
 }
}
