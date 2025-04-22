package bankingsystem;

public class Account {
private int acctno;
private int currentBalance;
Account(int acctno,int currentBalance)
{
	setAcctNo(acctno);
}
public void setAcctNo(int acctno)
{
	this.acctno=acctno;
}
public int getAcctNo()
{
 return acctno;
}
public void setBalance(int currentBalance)
{
	this.currentBalance=currentBalance;
}
public int getBalance()
{
	return currentBalance;
}
public void deposit(int amount)
{
	this.currentBalance=this.currentBalance+amount;
}
public void withdraw(int amount)
{
	this.currentBalance=this.currentBalance-amount;
}
}
