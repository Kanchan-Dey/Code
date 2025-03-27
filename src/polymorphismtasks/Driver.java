package polymorphismtasks;

public class Driver {
 public static void main(String[] args) {
	Employee e1= new FullTImeEmployee("KANCHAN",2000.0,1800);
	
	((FullTImeEmployee) e1).jobRole();
	e1.employeeInfo();
	Employee e2= new PartTimeEmployee("KANCHAN",3000.0,18);
	((PartTimeEmployee) e2).jobRole();
	e2.employeeInfo();
	Details(e1);
	Details(e2);
	
}
 public static void Details(Employee e)
	{
	  
      if(e instanceof FullTImeEmployee)
      {
    	  e.jobRole();
      }
      else
      {
    	  e.jobRole();
    		((PartTimeEmployee) e).Designation();
      }
	}
}
