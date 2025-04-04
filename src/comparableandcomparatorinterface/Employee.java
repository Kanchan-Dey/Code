package comparableandcomparatorinterface;

public class Employee implements Comparable {
 int id;
String name;
double salary;
Employee(int id,String name,double salary)
{
	this.id=id;
	this.name=name;
	this.salary=salary;
}
public String toString()
{
 return this.id+ " "+ this.name+" "+this.salary;

}
/*@Override
public int compareTo(Object o) {
    Employee e = (Employee)o;
    return (int)(this.salary-e.salary);
	
}*/
@Override
public int compareTo(Object o) {
	Employee e= (Employee)o;
	return this.name.compareTo(e.name);
}


}
