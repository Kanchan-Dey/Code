package linkedlist;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
 public static void main(String[] args) {
	
	 List<Student> students= new LinkedList<Student>();
	 students.add(new Student("Alice", 101));
     students.add(new Student("Bob", 102));
     students.add(new Student("Charlie", 1034));
     students.add(new Student("David", 104));

	 Collections.sort(students);
	 System.out.println(students);
	 Collections.sort(students,new CompareByName());
	 System.out.println(students);
	 Iterator<Student> itr = students.iterator();
	 while(itr.hasNext())
	 {
		 if(itr.next().name.equals("Alice"))
		 {
			 itr.remove();
		 }
	 }
	 System.out.println(students);
	 List ob = new LinkedList();
	 ob.add(0);
	 ob.add(1);
	 ob.add(2.6);
	 ob.add(2);
	 Collections.sort(ob, new Comparator<Number>() {
		    @Override
		    public int compare(Number n1, Number n2) {
		        return Double.compare(n1.doubleValue(), n2.doubleValue());
		    }
	 });
	 System.out.println(ob);
	 students.addLast(new Student("Lamba",2));
	  System.out.println(students);
	  System.out.println(students.getFirst());
	  System.out.println(students.getLast());
	  Iterator<Integer> itr1 =  ((LinkedList) ob).descendingIterator();
	  while(itr1.hasNext())
	  {
		  System.out.println(itr1.next());
	  }
	  System.out.println(ob.);
}
}
