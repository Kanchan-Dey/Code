package atmexception;

public class InvalidPinException extends Exception {
	private String message;
	 public InvalidPinException(String message)
	 {
		 this.message=message;
	 }
	 public String  getMessage()
	 {
		 return message;
	 }
}
