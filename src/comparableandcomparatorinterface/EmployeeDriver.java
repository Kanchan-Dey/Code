package comparableandcomparatorinterface;

public class EmployeeDriver {
public static void main(String[] args) {

	Employee e1= new Employee(1,"KANCH",200.0);
	Employee e2= new Employee(1,"KA",300.0);
	System.out.println(e1);
	System.out.println(e2);
	compareBasedOnName(e1,e2);
	compareBasedOnId(e1,e2);
	compareBasedOnSalary(e1,e2);
}
	public static void compareBasedOnName(Employee e1,Employee e2) {
	if(e1.compareTo(e2)>0)
	{
		System.out.println("e1 is greater");
	}
	else if(e1.compareTo(e2)<0)
	{
		System.out.println("e2 is greater");
	}
	else
	{
		System.out.println("e1 and e2 are equal");
	}
	}
	public static void compareBasedOnId(Employee e1,Employee e2) {
		
		CompareEmployeeById id=new CompareEmployeeById();
		if(id.compare(e1, e2)>0)
		{
			System.out.println("e1 is greater");
		}
		else if(id.compare(e1, e2)<0)
		{
			System.out.println("e2 is greater");
		}
		else
		{
			System.out.println("e1 and e2 are equal");
		}
		}
	public static void compareBasedOnSalary(Employee e1,Employee e2) {
		CompareBasedOnSalary sal=new CompareBasedOnSalary();
		if(sal.compare(e1, e2)>0)
		{
			System.out.println("e1 is greater");
		}
		else if(sal.compare(e1, e2)<0)
		{
			System.out.println("e2 is greater");
		}
		else
		{
			System.out.println("e1 and e2 are equal");
		}
		}
}
