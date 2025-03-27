package polymorphismtasks;

public class PartTimeEmployee extends Employee{
 private int workinghours;
 public PartTimeEmployee(String name,double salary,int workinghours) {
	 super(name,salary);
	 this.workinghours=workinghours;
 }
 public void jobRole()
 {
	 System.out.println("Job role of part time employee is cloud engineer");
 }
 public void employeeInfo()
 {
	 super.employeeInfo();
	 System.out.println("working hours:" + " " + this.workinghours);
 }
 public void Designation()
 {
	 System.out.println("cloudengineer");
 }
}
