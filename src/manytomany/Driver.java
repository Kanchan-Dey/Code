package manytomany;

import java.util.Arrays;
import java.util.Scanner;

public class Driver {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	Student student1 =new Student("raj",3);
	Student student2 =new Student("baj",2);
	Course course1= new Course("Java",2);
	Course course2= new Course("C",3);
	Course course3= new Course("Python",2);
	
	student1.addCourse(course1);
	student2.addCourse(course3);
	student1.addCourse(course3);
	System.out.println(Arrays.toString(student1.courses)+" "+ (Arrays.toString(student2.courses)));

}
}
