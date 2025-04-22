package interfaceabstractionpractice;

public class Bike extends AbstractVehicle{
	Bike(String name, int speed) {
		super(name, speed);
	}

	public void start() {

		System.out.println("Bike is starting");

	}

	public void stop() {

		System.out.println("Bike is stopping");
	}

	public void displayDetails() {
		System.out.println("ORiginal DEtails" + " " + name + " " + speed);
	}
}
