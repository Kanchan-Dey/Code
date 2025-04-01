package abstractiontask;

public class CreditCard extends Payment{
   public CreditCard(double amount,String transactionId)
   {
	   super(amount,transactionId);
   }
   void processPayment()
   {
	   System.out.println("Processing Credit Card Payment...");
	   System.out.println("TRANSACTION ID:"+ getTransactionId());
	  System.out.println("Original Amount"+ getAmount());
	  double discount = super.applyDiscount();
	  System.out.println("Discount Applied:"+ " "+ discount);
	  double transactionFee = getAmount()*0.02;
	  System.out.println("Transaction Fee"+" "+transactionFee);
	  double finalPayableAmount= (getAmount()-discount)+transactionFee;
	  System.out.println("Final Payable Amount"+ " "+finalPayableAmount);
	  System.out.println("Credit Card Payment Successful");
  }
}
