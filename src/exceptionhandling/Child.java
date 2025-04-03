package exceptionhandling;

public class Child extends Parent {
	void demo(){
		System.out.println("Child");
	}
	public static void main(String[] args) {
		Parent c= new Child();
		c.demo();
	}

}
