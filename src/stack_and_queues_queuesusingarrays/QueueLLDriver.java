package stack_and_queues_queuesusingarrays;

import java.util.Scanner;

public class QueueLLDriver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
         QueueUsingLL list= new QueueUsingLL();
		boolean flag = true;
		while (flag) {
			System.out.println("Enter 1 to enqueue\nEnter 2 to dequeue\nEnter 3 to peek\nEnter 4 to display\nEnter 5 to exit");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the data");
				int data = sc.nextInt();
				list.enqueue(data);
				break;
			case 2:
				list.dequeue();
				break;
			case 3:
				list.peek();
				break;
			case 4:
				list.display();
				break;
			case 5:
				flag = false;
				break;
			}
		}
}
}
