package queue_collection;

import java.util.PriorityQueue;

public class PriorityQueueDemo {public static void main(String[] args) {
	PriorityQueue ps= new PriorityQueue();
	ps.add(1);
	ps.add(2);
	ps.add(3);
	ps.add(5);
	ps.poll();//removes the first element
	
	System.out.println(ps);
}

}
