package oopspractice;

import java.util.List;

public class Driver {
public static void main(String[] args) {
	Department dept= new Department("Engineering");
	try
	{
		dept.addEmployee(new Developer("EMP\\d{3}","Aditya",20000.0,"JAVA"));
		dept.addEmployee(new Developer("EMP\\d{3}","Kanchan",30000.0,"JAVA"));
		dept.addEmployee(new Manager("EMP\\d{3}","Rohit",35000.0,200));
		dept.addEmployee(new Developer("EMP\\d{3}","Ankita",10000.0,"C"));
	
	  System.out.println("Testing calculateBonus");
	  List bonuses= dept.getEmployees().forEach(e->System.out.println("name: "+ e.getName()+"bonus: "+e.calculateBonus()));.
	
	
	
	}
	catch(InvalidEmployeeException | De)
	
}
}
