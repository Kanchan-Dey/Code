package exceptionhandling;

public class throwskeyword {


public static void main(String[] args) {
	try {
		div(10,0);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public static void div(int x,int y)throws RuntimeException,ClassNotFoundException,Exception{
	System.out.println(x/y);
}
}



