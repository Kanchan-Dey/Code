package abstractiontask;

public class PayPal extends Payment{
	 public PayPal(double amount,String transactionId)
	   {
		   super(amount,transactionId);
	   }
	   void processPayment()
	   {
		   System.out.println("Processing PayPal Payment...");
		   System.out.println("TRANSACTION ID:"+ getTransactionId());
		  System.out.println("Original Amount"+ getAmount());
		  double discount = super.applyDiscount();
		  System.out.println("Discount Applied:"+ " "+ discount);
		  double transactionFee = getAmount()*0.03;
		  System.out.println("Transaction Fee"+" "+transactionFee);
		  double finalPayableAmount= (getAmount()-discount)+transactionFee;
		  System.out.println("Final Payable Amount"+ " "+finalPayableAmount);
		  System.out.println("PayPal Payment Successful");
	  }
}
