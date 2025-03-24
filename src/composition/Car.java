package composition;

public class Car {
String name;
Engine e;
public Car(String name,String type) {
	this.name=name;
	this.e=new Engine(type);
	}
public void display() {
	System.out.println(name + " "+e.type);
}
}
