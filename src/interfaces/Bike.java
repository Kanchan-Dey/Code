package interfaces;

public class Bike implements Vehicle {
  public void print()
  {
	  System.out.println("hello world");
	  
  }
  public void start()
  {
	  System.out.println("bike is starting");
  }
  public void text()//inheriting default method from interface to class
  {
	  System.out.println("Hi");
  }
}
