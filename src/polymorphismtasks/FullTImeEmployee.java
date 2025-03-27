package polymorphismtasks;

public class FullTImeEmployee extends Employee {
 private int bonus;
 public FullTImeEmployee(String name,double salary,int bonus)
 {
	 super(name,salary);
	 this.bonus=bonus;
 }
 public void employeeInfo()
 {
	 super.employeeInfo();
	 System.out.println("bonus" + " " +this.bonus);
 }
 public void jobRole()
 {
	 System.out.println("job role of full time employee is mern stack developer");
 }
 
}
