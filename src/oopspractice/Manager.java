package oopspractice;

public class Manager extends Employee {
   private int teamsize;
   Manager(String id,String name,double salary,int teamsize) throws InvalidEmployeeException
   {
	   super(id,name,salary);
	   this.teamsize=teamsize;
   }
  public int getTeamSize()
  {
	  return teamsize;
  }
   void calculateBonus()
   {
	   double bonus = (25/100)*getSalary()+(getTeamSize()*100);
   }
}
