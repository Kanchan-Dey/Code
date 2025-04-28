package uberridemanagement;

public class Customer extends User{
Customer(String id,String name)
{
	super(id,name);
}
void showProfile()
{
	System.out.println("Customer name"+ " " +this.name);
}
}
