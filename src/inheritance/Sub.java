package inheritance;

public class Sub extends Super{
 double a=12.0;
 static double b =15.0;
 void prints()
 {
	 System.out.println(super.a);
	 System.out.println(a);
	 System.out.println(Super.b);
	 System.out.println(b);
 }
}
