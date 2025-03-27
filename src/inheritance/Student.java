package inheritance;

public class Student extends Person {
private  int StudentId;
public Student(String name,int age,int StudentId)
{
	super(name,age);
	this.StudentId=StudentId;
	
}

public void displayDetails()
{
	
    super.displayDetails();
	System.out.println(this.StudentId);
	System.out.println();
}
}
