package exceptionhandling;

public class UserLogin {
 private int pin=1234;
 public void Login(int pin)
 {
	 if(this.pin==pin)
	 {
		 System.out.println("User successfully logged in");
		 
	 }
	 else
	 {
		 throw new InvalidPinException("The user pin is invalid");
	 }
 }
 public static void main(String[] args) {
	System.out.println("main start");
	UserLogin user = new UserLogin();
	user.Login(1232);
	System.out.println("main end");
}
 
}
