package stack_and_queues_queuesusingarrays;

public class QueueUsingLL {
	Node front = null;
	Node rear = null;
	static int count = 0;

	public void enqueue(int data) {
		Node node = new Node(data);
		if (front == null) {
			front = node;
			rear = node;
			count++;
			return;
		} else {
			rear.next = node;
			rear = node;
			count++;
			return;
		}
	}

	public void dequeue() {
		if(front==null)
		{
			System.out.println("Queue is empty");
			return;
		}
		Node temp = front;
		front = front.next;
		temp.next = null;
	}
	public void peek()
	{
		System.out.println(front.data);
	}
	public void display()
	{
		if(front==null)
		{
			System.out.println("Queue is empty");
		}
		Node curr=front;
		while(curr!=null)
		{
			System.out.println(curr.data + " ");
			curr= curr.next;
		}
	}
}
