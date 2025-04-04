package atmexception;

public class YouArePoorException extends Exception {
	private String message="YOU ARE DUMB POOR";
	public YouArePoorException(String message)
	{
		this.message=message;
	}
public String getMessage()
{
	return message;
}
}
