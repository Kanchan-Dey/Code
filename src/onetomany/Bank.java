package onetomany;

public class Bank {
String bankNo;//bankname
Customer[] customers;//customer array reference
static int count=0;//just a count variable so we dont need a copy of it in our objects , as we are dealing with one bank it can be static
public Bank(int size,String bankNo)
{
	this.customers= new Customer[size];//creating the object
	this.bankNo = bankNo;
}
public void  addCustomer(Customer customer)//for adding our customers in a customer array we need a customer object given by the user
{
	if(count<customers.length)
	{
		customers[count++]=customer;//reassinging the value from null to customer objects
		System.out.println("customer added");
	}
	else
	{
		System.out.println("customer not added");
	}
}
public void displayCustomers()
{
	for(int i=0;i<count;i++)
	{
		System.out.println(customers[i].customerName);
		System.out.println(customers[i].id);
	}
}
}
