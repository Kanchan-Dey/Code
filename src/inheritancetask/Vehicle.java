package inheritancetask;

public class Vehicle {
 private String vehicleNumber;
 private String brand;
 private String model;
 private double rentalpriceperDay;
 private boolean isAvailable;
 public Vehicle(String vehicleNumber,String brand,String model,double rentalpriceperDay,boolean isAvailable)
 {
	 this.vehicleNumber=vehicleNumber;
	 this.brand=brand;
	 this.model=model;
	 this.rentalpriceperDay=rentalpriceperDay;
	 this.isAvailable=isAvailable;
 }
 public void displayDetails()
 {
	 System.out.println(this.vehicleNumber);
	 System.out.println(this.brand);
	 System.out.println(this.model);
	 System.out.println(this.rentalpriceperDay);
 }
 public void rentVehicle()
 {
	 if(this.isAvailable)
	 {
		 System.out.println("Vehicle is available");
	 }
	 else
	 {
		 System.out.println("vehicle is not available");
	 }
 }
}
