package objectClass;

public class EmployeeDriver {
public static void main(String[] args) {
	Employee e1= new Employee("kanchan",1000.0,12);
	Employee e2= new Employee("kanchan",1000.0,12);
	System.out.println(e1);//this is equal to e1.toString()
	System.out.println(e1.equals(e2));
	System.out.println(e1.hashCode());
	System.out.println(e2.hashCode());
	String s="kanchan";
	System.out.println(s.hashCode());

}
}
