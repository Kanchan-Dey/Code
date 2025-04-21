package casestudies;

public class Student extends Person{
private int studentId;
  Student(String name,int age,int studentId){
	  super(name,age);
	this.studentId=studentId;
}


public void StudentDetails()
{
	super.displayPersonDetails();
	System.out.print(studentId);
}
}
