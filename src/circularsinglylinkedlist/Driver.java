package circularsinglylinkedlist;

import java.util.Scanner;

public class Driver {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	boolean flag=true;
	CircularSinglyLinkedlist cir = new CircularSinglyLinkedlist();
	while(flag) {
	System.out.println("Enter 1 to insert\nEnter 2 to display\nEnter 3 to update\nEnter 4 to insert at any position\nEnter 5 to delete at any position\nEnter 6 to exit");
	int ch=sc.nextInt();

	switch(ch)
	{
	case 1:{
		System.out.println("Enter the data");
		int data=sc.nextInt();
		cir.insert(data);
		break;
	}
	case 2:
	{
		cir.display();
		break;
	}
	case 3:
		System.out.println("Enter the position");
		int posi=sc.nextInt();
		System.out.println("Enter the data");
		int data=sc.nextInt();
		cir.update(posi, data);
		break;
	case 4:
		System.out.println("Enter the position");
		int posi2=sc.nextInt();
		System.out.println("Enter the data");
		int data2=sc.nextInt();
		cir.insertAtAny(posi2, data2);
		break;
	case 5:
		System.out.println("Enter the position");
		int posi3= sc.nextInt();
		cir.deleteAtAny(posi3);
		break;
	case 6: 
		
		flag=false;
		break;
	}
	}
}
}
