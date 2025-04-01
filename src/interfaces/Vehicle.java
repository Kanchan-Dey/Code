package interfaces;

public interface Vehicle {
 void print();
 void start();
 public  static void  utility()
 {
	 System.out.println("this is a utility method");
 }
 public static void main(String[] args) {
	utility();
}
 default void text()
 {
	 System.out.println("this is a default method");
 }
}
