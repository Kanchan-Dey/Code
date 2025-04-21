package casestudies;

public class PartTimeEmployee extends Employee{
private int workingHours;
PartTimeEmployee(String name,double salary,int workingHours)
{
	super(name,salary);
	this.workingHours=workingHours;
}
public void PartTimeEmployeeInfo()
{
	System.out.println("PARTTIMEEMPLOYEE");
	super.employeeIngo();
	System.out.println(workingHours);
}
}
