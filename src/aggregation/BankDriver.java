package aggregation;

public class BankDriver {
public static void main(String[] args) {
	Customer cust= new Customer("MS DHONI");
	Bank bank = new Bank("SBI",cust);
	bank.display();
	bank=null;
	System.out.println(cust.customerName);
}
}
