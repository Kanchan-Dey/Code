package inheritance;

public class Child extends Parent{
    public void display() {
    	
   	 System.out.println(b);//non static variables inherited in class
   System.out.println(a);//static variables inherited in class
      mesage();//non static methods are inherited
      print();//static methods are inherited
    }
}
