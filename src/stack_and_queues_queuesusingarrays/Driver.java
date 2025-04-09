package stack_and_queues_queuesusingarrays;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the queue");
		int n = sc.nextInt();
		int arr[] = new int[n];
		Queue stac = new Queue(arr);
		boolean flag = true;
		while (flag) {
			System.out.println(
					"Enter 1 to enqueue\nEnter 2 to dequeue\nEnter 3 to peek\nEnter 4 to display\nEnter 5 to exit");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the data");
				int data = sc.nextInt();
				stac.enqueue(data);
				break;
			case 2:
				stac.dequeue();
				break;
			case 3:
				stac.peek();
				break;
			case 4:
				stac.display();
				break;
			case 5:
				flag = false;
				break;
			}
		}
	}
}
