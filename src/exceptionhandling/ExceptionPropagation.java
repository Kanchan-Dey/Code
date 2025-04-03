package exceptionhandling;

public class ExceptionPropagation {
	public static void main(String[] args) {
        alpha();
	}
	public static void alpha()
	{
		System.out.println("this is alpha");
		beta();
	}
	public static void beta()
	{
		System.out.println("this is beta");
		gamma();
	}
	public static void gamma()
	{
		System.out.println("this is gamma");
		try {
		System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
		  System.out.println("DONT DIVIDE BY 0 U DUMB DUMB RAT BASTARD");
		}
	}
	
}
