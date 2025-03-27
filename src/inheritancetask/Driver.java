package inheritancetask;

public class Driver {
 public static void main(String[] args) {
	Bike bike=new Bike("KAWASAKI","HU","HTH",8000.0,true,true);
	Car car= new Car("tata","bh","bhis",9000.0,false,18);
	bike.displayDetails();
	bike.rentVehicle();
	car.rentVehicle();
	car.displayDetails();
}
}
