package onetomany;

public class Demo {
public static void main(String[] args) {
	Customer c1 = new Customer("rohit",10);
	Customer c2=c1;
	System.out.println(c1+ " "+c2);
	
}
}
