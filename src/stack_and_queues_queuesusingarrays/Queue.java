package stack_and_queues_queuesusingarrays;

public class Queue {
	static int rear = -1;
	static int front = 0;
	int[] arr;
	int size = 0;

	Queue(int[] arr) {
		this.arr = arr;
	}

	public void enqueue(int data) {
		if (rear == arr.length) {
			System.out.println("Queue is full");
			return;
		}
		if (rear <= arr.length - 1) {
			rear++;
			arr[rear] = data;
			size++;
			return;
		}
	}

	public void dequeue() {
		if (front>rear) {
			System.out.println("queue is empty");
		}
		for (int i = 0; i < size; i++) {
			System.out.println(arr[i] + " has been dequeued");
			arr[i] = arr[i + 1];
			rear--;
		}

	}

	public void peek() {
		System.out.println(arr[front]);
	}

	public void display() {
		if(front<rear) {
		for(int i=front;i<=rear;i++)
		{
			System.out.println(arr[i]);
		}
		}
		else
		{
			System.out.println("queue is empty");
		}
	}
}
