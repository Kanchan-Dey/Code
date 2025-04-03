package exceptionhandling;

public class InvalidPinException extends RuntimeException {
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
