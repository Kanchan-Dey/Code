package objectClass;

public class Employee implements Cloneable{
   private String name;
    private double salary;
    private int id;
    public Employee(String name,double salary,int id)
    {
    	this.name=name;
    	this.salary=salary;
    	this.id=id;
    }
    public String toString()
    {

     System.out.println(this.name +" "+ this.salary);
     return "";
    }
    public boolean equals(Object o)
    {
    	if(o instanceof Employee) {
    	Employee e =(Employee)o;
    	return this.salary==e.salary;}// here this refers to e1 and e or the object inside equals refers to e2
   return false;
   }
   public int hashCode() {
	   return (int)(this.salary+this.id);
   }
	Object e3=new Employee(name, salary, id).clone();
}
