package singlylinkedlist;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Singly_Linked_List list = new Singly_Linked_List();
		boolean flag = true;
		while (flag) {
			System.out.println("Enter 1 to insert data\nEnter 2 to exit\nEnter 3 to display data\nEnter 4 to update data\nEnter 5 to insert at any position\nEnter 6 to delete from front\nEnter 7 to delete at any");
			int choice = sc.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("Enter the data");
				int data = sc.nextInt();
				list.insert(data);
				break;
			}
			case 2: {
				flag = false;
				break;
			}
			case 3:
			{
				list.display();
				break;
			}
			case 4:
			{
				System.out.println("Enter the position");
				int posi=sc.nextInt();
				System.out.println("Enter the data");
				int data=sc.nextInt();
				list.update(posi, data);
				break;
			}
			case 5:
			{
				System.out.println("Enter the position");
				int posi=sc.nextInt();
				System.out.println("Enter the data");
				int data=sc.nextInt();
				list.insertAtAnyPosi(posi, data);
				break;
			}
			case 6:{
				list.delete();
				break;
			}
			case 7:{
				System.out.println("Enter the position");
				int posi=sc.nextInt();
				list.deleteAtAny(posi);
				break;
			}
		}
	}
}
}
