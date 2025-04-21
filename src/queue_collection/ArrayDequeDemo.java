package queue_collection;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
public static void main(String[] args) {
	ArrayDeque ad= new ArrayDeque();
	//ad.add(null);//gives nullpointer exception
	ad.add(1);
	ad.add("hello");
	System.out.println(ad.getFirst());
	System.out.println(ad.getLast());
}
}
