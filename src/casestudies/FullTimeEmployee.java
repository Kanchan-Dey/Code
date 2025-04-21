package casestudies;

public class FullTimeEmployee extends Employee{
private int bonus;
FullTimeEmployee(String name,double salary,int bonus)
{
	super(name,salary);
	this.bonus=bonus;
}

public void FullTimeEmployeeInfo()
{
	System.out.println("FULLTIMEEMPLOYEE");
	super.employeeIngo();
	System.out.println(bonus);
}
	
}
