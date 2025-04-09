package stack_and_queues;

public class StackUsingLL {
	StackNode top = null;

	static int size = 0;

	public void push(int data) {
		StackNode node = new StackNode(data);
		node.next = top;
		top = node;
		size++;
		System.out.println(data + " has been pushed");
		return;

	}

	public void pop() {
		StackNode temp=top;
		int data=temp.data;
		top = top.next;
		temp.next=null;
		size--;// no use
		System.out.println(temp + " has been popped");
		return;
	}

	public void peek() {
		if (top == null) {
			System.out.println("Stack underflow");
		} else {
			System.out.println(top.data);
		}
	}

	public void display() {

		int i = 1;
		StackNode curr = top;
		if (curr == null) {
			System.out.println("Stack underflow");
		}
		while (curr!=null) {
			System.out.println(curr.data + " ");
			curr = curr.next;
		
		}
	}
}
