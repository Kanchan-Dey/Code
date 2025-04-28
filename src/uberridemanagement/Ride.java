package uberridemanagement;

public class Ride {
private Customer customer;
private Driver driver;
private String status;
Ride(Customer customer,Driver driver,String status)
{
	setCustomer(customer);
	setDriver(driver);
	this.status=status;
	this.driver.setAvailable(false);
}
public void setCustomer(Customer customer)
{
	this.customer=customer;
}
public void setDriver(Driver driver)
{
	this.driver=driver;
}

public Customer getCustomer()
{
	return customer;
}
public Driver getDriver()
{
 return driver;
}
public void completeRide()
{
	this.status="Completed";
	this.driver.setAvailable(true);
}
public String getStatus()
{
	return status;
}
public String RideDetails()
{
	return "Customer name " + getCustomer().name + " "+ "Driver name "+ getDriver().name+ " "+ "Current status "+ getStatus();
}
}
