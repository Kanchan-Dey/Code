package casestudies;

public class Student1 extends Person1{
private int studentId;
public Student1(String name,int age,int studentId)
{
	super(name,age);
	setStudentId(studentId);
}
private void setStudentId(int studentId) {
	
	this.studentId=studentId;
}
private int getStudentId()
{
	return studentId;
}
public void displayStudentInfo()
{
	super.DisplayInfo();
	System.out.println("Student ID"+ " "+ getStudentId());
}
}
