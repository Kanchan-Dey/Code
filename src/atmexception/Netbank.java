package atmexception;

public class Netbank {
	
		private int currentbalance=5000;
		private int pin=1234;
		public void setBalance(int deposit,int pin) throws InvalidPinException
		{
			if(this.pin == pin) {
			currentbalance+=deposit;
			}
			else
			{
				throw new InvalidPinException("The user pin is invaid");
			}
		}
		public void getBalance(int pin) throws InvalidPinException
		{
	   if(this.pin == pin) {
			System.out.println(currentbalance);
	   }
	   else
	   {
		   throw new InvalidPinException("The user pin is invaid");
	   }
		}
		public void withdraw(int withdraw,int pin) throws InvalidPinException,YouArePoorException
		{
			if(this.pin == pin)
			{
				if(currentbalance>withdraw) {
			
			currentbalance-=withdraw; 
		
				}
				else
				{
				    throw new YouArePoorException("KICHU KAJ KORMO KHOJ REH BHAI. MA BABA KE KE DEKHBE");  
				}
			}
			else
			{
				throw new InvalidPinException("The user pin is invaid");
			}
		}
	
}


