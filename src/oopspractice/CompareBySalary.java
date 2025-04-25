package oopspractice;

import java.util.Comparator;

public class CompareBySalary implements Comparator<Employee>{
      public int compare(Employee e1, Employee e2)
      {
    	  return (int)(e2.getSalary()-e1.getSalary());
      }
}
