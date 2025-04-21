package linkedlist;

import java.util.Comparator;

public class Student implements Comparable<Student>{
  String name;
  int id;
  public Student(String name,int id)
  {
	  this.name=name;
	  this.id=id;
	  
  }
@Override
public int compareTo(Student o1) {
	// TODO Auto-generated method stub
	return this.id-o1.id;
}
public String toString()
{
	return id+" "+name;
}
  
}
