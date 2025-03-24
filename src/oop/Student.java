package oop;

public class Student {
	int stdid;
	String bhv;
	String name="kanchan";
	String cllgname;
	double marks;
 public Student(int stdid,String name,String cllgname,double marks) {
	this(stdid,name);// calling  the constructor with stdid and name 

	this.cllgname=cllgname;
	this.marks=marks;
	System.out.println("4 arg");
	
 }
 public Student()
 {
	 System.out.println("no arg constr");
 }
 public Student(int stdid,String name)//this is the one being called in line 10
 {
	this.stdid=stdid;
	this.name=name;
	 System.out.println("two arg");
 }
	public void Studying() {
		System.out.println(stdid);
		System.out.println(name+" is studying");

	}
}
