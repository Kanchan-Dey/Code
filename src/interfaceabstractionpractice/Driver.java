package interfaceabstractionpractice;

public class Driver {
public static void main(String[] args) {
	AbstractVehicle vehicle = new Car("BMW",100);
	AbstractVehicle vehicle1 = new Bike("Kawasaki",100);
	AbstractVehicle vehicle2 = new Truck("Mercedes",100);
	vehicle.start();
	vehicle.displayDetails();
	vehicle.accelerate(10);
	vehicle.brake(20);
	vehicle.stop();
	vehicle1.start();
	vehicle1.displayDetails();
	vehicle1.accelerate(10);
	vehicle1.brake(20);
	vehicle1.stop();
	vehicle2.start();
	vehicle2.displayDetails();
	vehicle2.accelerate(10);
	vehicle2.brake(20);
	vehicle2.stop();
	
}
}
