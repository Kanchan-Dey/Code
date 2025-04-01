package abstractiontask;

public class Driver {
public static void main(String[] args) {
	Payment p= new CreditCard(600.0,"TXN12345");
	p.processPayment();

	Payment p1= new PayPal(300.0,"TXN67890");
	p1.processPayment();
}
}