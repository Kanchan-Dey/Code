package aggregation;

public class Bank {
    String bankName;
    Customer cust;
    public Bank(String bankName,Customer cust)
    {
    	this.bankName=bankName;
    	this.cust= cust;
    }
    public void display()
    {
    	System.out.println(bankName +" "+ this.cust.customerName);
    }
}
