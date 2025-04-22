package interfaceabstractionpractice;

public class Car extends AbstractVehicle {
	Car(String name, int speed) {
		super(name, speed);
	}

	public void start() {

		System.out.println("Car is starting");

	}

	public void stop() {

		System.out.println("Car is stopping");
	}

	public void displayDetails() {
		System.out.println("ORiginal DEtails" + " " + name + " " + speed);
	}

}
