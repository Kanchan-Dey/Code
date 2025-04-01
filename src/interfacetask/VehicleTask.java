package interfacetask;

public class VehicleTask {
public static void main(String[] args) {
	Vehicle c= new Car("TATA",180);
	Vehicle b= new Bike("BMW",170);
	Vehicle t = new Truck("MAhindra",120);
	c.start();
	c.accelerate(20);
	c.getCurrentSpeed();
	c.brake(10);
	
	c.getCurrentSpeed();
	c.stop();
	b.start();
	b.accelerate(20);
	b.getCurrentSpeed();
	b.brake(10);

	b.getCurrentSpeed();
	b.stop();
	t.start();
	t.accelerate(20);
	t.getCurrentSpeed();
	t.brake(10);
	
	t.getCurrentSpeed();
	t.stop();
	
}
}
