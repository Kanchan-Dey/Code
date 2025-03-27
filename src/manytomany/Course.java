package manytomany;

public class Course {
String courseName;
Student[] students;

public Course(String courseName,int size)
{
	this.courseName=courseName;
	students= new Student[size];
}
}
