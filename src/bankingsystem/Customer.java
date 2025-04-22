package bankingsystem;

import java.util.ArrayList;
import java.util.List;

public class Customer {
private String custname;
private int password;
private List<Account> accounts;
Customer(String custname,int password)
{
	setcustName(custname);
	setPassword(password);
	this.accounts= new ArrayList<Account>();
}
public void setcustName(String custname)
{
	 this.custname=custname;
}
public String getCustName()
{
	return custname;
}
public void setPassword(int password)
{
	 this.password=password;
}
public int getPassword()
{
	return password;
}

}
