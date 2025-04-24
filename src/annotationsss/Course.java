package annotationsss;



//Annotations are metadata that provide information about the code without affecting the code's functionality.
//@CourseInfo(courseName = "Java", duration = 98) not required to set value if default value is provided
@CourseInfo
public class Course {
 public void display() {
     System.out.println("Welcome to course");
 }
}
