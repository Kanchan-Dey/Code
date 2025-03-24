package oop;

public class EmployeeDriver {
 public static void main(String[] args) {
	Employee e1=new Employee(1);
	System.out.println(e1.empid);
	System.out.println();
	Employee e4=new Employee(2,"paglu");
	System.out.println(e4.empid+" "+ e4.name);
	System.out.println();
	Employee e6=new Employee(1,"harry","capgemini",4000);
	System.out.println(e6.empid + " "+e6.name+" "+e6.cmpname+" "+e6.salary);
}
}
