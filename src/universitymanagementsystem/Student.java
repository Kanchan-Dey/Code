package universitymanagementsystem;

public class Student extends Person {
private int studentId;
public Student(String name,int age,int studentId)
{
	super(name,age);
	this.studentId=studentId;
}
public void displayInfo()
{
	super.displayInfo();
	System.out.println("STUDENT ID" + " " + this.studentId);
}
}
