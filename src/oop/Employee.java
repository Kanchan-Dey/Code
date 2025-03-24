package oop;



public class Employee{
	int empid;
	
	String name;
	String cmpname;
	double salary;
 public Employee(int empid,String name,String cmpname,double salary) {
	this(empid,name);// calling  the constructor with stdid and name 

	this.cmpname=cmpname;
	this.salary=salary;
	System.out.println("4 arg");
	
 }
 public Employee(int empid)
 {
	 this.empid=empid;
	 System.out.println("one arg constr");
 }
 public Employee(int empid,String name)//this is the one being called in line 10
 {
	this(empid);
	this.name=name;
	 System.out.println("two arg");
 }
	public void Working() {
		System.out.println(empid);
		System.out.println(name+" is working");

	}
}

