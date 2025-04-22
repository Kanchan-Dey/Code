package interfaceabstractionpractice;

public class Truck extends AbstractVehicle{
	Truck(String name, int speed) {
		super(name, speed);
	}

	public void start() {

		System.out.println("Truck is starting");

	}

	public void stop() {

		System.out.println("Truck is stopping");
	}

	public void displayDetails() {
		System.out.println("ORiginal DEtails" + " " + name + " " + speed);
	}
}
