package onetomany;

import java.util.Scanner;

public class Driver {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter array size");
	int size =sc.nextInt();
	Bank bank = new Bank(size,"SBI");
	boolean flag=true;
	while(flag)
	{
		System.out.println("enter 1 for addition enter 2 for displaying, Enter 3 to exit");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("enter id");
			int id=sc.nextInt();
			sc.nextLine();
			System.out.println("enter customer name");
			String name = sc.nextLine();
			Customer customer =new Customer(name,id);
			bank.addCustomer(customer);
			break;
		case 2:
			bank.displayCustomers();
			break;
		case 3:
			flag = false;
			break;
	
			
		}
	}
	
}
}
