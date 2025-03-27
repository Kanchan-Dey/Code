package inheritancetask;

public class Car extends Vehicle{
 private int numberofDoors;
 public Car(String vehicleNumber,String brand,String model,double rentalpriceperDay,boolean isAvailable,int numberofDoors) {
	 super(vehicleNumber,brand,model,rentalpriceperDay,isAvailable);
	 this.numberofDoors=numberofDoors;
	 
 }
 public void displayDetails()
 {
	 super.displayDetails();
	 System.out.println(this.numberofDoors);
 }
}
