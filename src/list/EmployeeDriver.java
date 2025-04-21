package list;

import java.util.ArrayList;
import java.util.*;

public class EmployeeDriver {
	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee("SUCHI", 1));
		employees.add(new Employee("RUCHI", 4));
		employees.add(new Employee("NAVIN", 3));
		for (Employee e : employees) {
			System.out.println(e);
		}
		Collections.sort(employees);
		System.out.println(employees);
		Collections.sort(employees,new CompareByName());
		System.out.println(employees);
		Iterator<Employee> itr1 = employees.iterator();
		/*while (itr1.hasNext()) {
			Employee x = itr1.next();
			if (x.name.equals("NAVIN")) {
				itr1.remove();
			}
		}*/
		ArrayList<Integer> employees1 = new ArrayList();
		employees1.add(1);
		employees1.add(22);
		employees1.add(3);
		System.out.println(employees1);
	    Collections.sort(employees1);//this gives class cast exception without the arraylist having the generic
		System.out.println(employees1);
		
	    System.out.println("KICKING OUT NAVIN");
		System.out.println(employees);
		ArrayList<Integer> arrlist = new ArrayList<Integer>();

		arrlist.add(1);
		arrlist.add(2);
		arrlist.add(3);
		arrlist.add(4);
		arrlist.add(5);
		for (int i : arrlist) {// it gets auto-unboxed to primitive data type
			if (i == 1) {
				Integer x = i;// boxing it back to access the non primitive
				arrlist.remove(x);
				break;// using the break to break out of the loop to prevent the error mentioned in
						// the next comment. So we have to break the loop after the modification if we r
						// using a for each loop
			} // we get concurrent modification error when we r manipulating the data of a
				// collection using a for each loop. So for each loop should be used only for
				// accessing data,not modifying it. We use iterator interface to replace this
				// bullcrap.
			System.out.println(i);
		}
		Iterator<Integer> itr = arrlist.iterator();// we cannot create object of an interface so the implementing class
													// of the iterator is getting created and then the object of that
													// class is getting upcasted to iterator type.THis implementing
													// class is implicitly added by the developers of java
		while (itr.hasNext()) {
			int x = itr.next();// the returned integer object is autounboxed to integer
			if (x == 5) {
				itr.remove();
			}
			System.out.println(x);
		}
		System.out.println(arrlist);
		// the initial pointer for iterator is outside before the iterator object and
		// then the hasnext method is called to check if there is an element and if
		// there is the next method is used to move the pointer to the next element
	  ListIterator<Integer> list = arrlist.listIterator();
	/*  while(list.hasNext())
	  {
		  System.out.println("Index " + list.nextIndex()+" "+list.next());
	  }*/
	  while(list.hasNext())// this loop doesnt get executed when we have already traversed through the list in the previous loop
	  {
		  if((int)list.nextIndex()==1)
		  {
			  list.add(50);
		  }
		  
	  }
	  System.out.println(arrlist);
	  //Collections.sort(employees) gives an error as the catch is that the class objects inside should have comparable interface implemented
        //so we need to implement comparable in  employee class
	
	}
}
