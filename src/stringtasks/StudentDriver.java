package stringtasks;

public class StudentDriver {
public static void main(String[] args) {
	Student s1= new Student("kan",2,'F',200.0);
	Student s2= new Student("kan",2,'F',200.0);
	System.out.println(s1.toString());
	System.out.println(s2.toString());
	System.out.println(s1.equals(s2));
	System.out.println(s2.hashcode());
}
}
