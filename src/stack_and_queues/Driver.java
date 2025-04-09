package stack_and_queues;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the stack");
		int n = sc.nextInt();
		int arr[] = new int[n];
		Stack stac = new Stack(arr);
		boolean flag = true;
		while (flag) {
			System.out.println("Enter 1 to push\nEnter 2 to pop\nEnter 3 to peek\nEnter 4 to display\nEnter 5 to exit");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the data");
				int data = sc.nextInt();
				stac.push(data);
				break;
			case 2:
				stac.pop();
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
