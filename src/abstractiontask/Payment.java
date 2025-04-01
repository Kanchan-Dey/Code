package abstractiontask;

abstract public class Payment {
	private double amount;
	private String transactionId;
	public Payment(double amount,String transactionId)
	{
		this.amount=amount;
		this.transactionId=transactionId;
	}
	public double getAmount()
	{
	 return this.amount;
	}
	public String getTransactionId()
	{
		return this.transactionId;
	}
	public double applyDiscount() {
		return (this.amount>500? this.amount*0.1:0);
	}
 abstract void processPayment();
}
