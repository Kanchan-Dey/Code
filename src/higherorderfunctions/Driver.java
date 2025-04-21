package higherorderfunctions;

public class Driver {
public static void main(String[] args) {
	Test t = new Test();
	t.greet(()->System.out.println("Hello"));
	
}
}
