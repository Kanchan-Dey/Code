package stack_and_queues;

import java.util.Scanner;

public class StackLLDriver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		StackUsingLL list= new StackUsingLL();
		boolean flag = true;
		while (flag) {
			System.out.println("Enter 1 to push\nEnter 2 to pop\nEnter 3 to peek\nEnter 4 to display\nEnter 5 to exit");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the data");
				int data = sc.nextInt();
				list.push(data);
				break;
			case 2:
				list.pop();
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
