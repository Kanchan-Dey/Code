package calculator;

import java.util.Scanner;

public class Calculator {

	public static void addMenu() {
		boolean flag=true;
		Scanner sc = new Scanner(System.in);
		while(flag) {
		System.out.println("enter 1 for 2 numbers, 2 for 3 numbers, 3 for 4 numbers,5 for exit,6 for continue");
		
		int  n = sc.nextInt();
	
		double sum;
		if(n==5)
		{
			flag=false;
			System.out.println("exiting addition menu");
			break;
		}
		
		switch (n) {
		case 1:
			System.out.println("enter the numbers");
			double num1 = sc.nextDouble();
			double num2 = sc.nextDouble();
			System.out.println(num1 + num2);
			break;

		case 2:
			System.out.println("enter the numbers");
			double num11 = sc.nextDouble();
			double num21 = sc.nextDouble();
			double num31 = sc.nextDouble();
			System.out.println(num11 + num21 + num31);
			break;
		case 3:
			System.out.println("enter the numbers");
			double num12 = sc.nextDouble();
			double num22 = sc.nextDouble();
			double num32 = sc.nextDouble();
			double num42 = sc.nextDouble();
			System.out.println(num12 + num22 + num32 + num42);
			break;
		
		case 6: 
			break;
		default:

			System.out.println("INVALID INPUT");

		}
		}
	}

	public static void subMenu() {
		Scanner sc = new Scanner(System.in);
		boolean flag=true;
		while(flag==true) {
		System.out.println("enter 1 for 2 numbers, 2 for 3 numbers, 3 for 4 numbers,5 for exit,6 for continue");
		int n = sc.nextInt();
		
		if(n==5) {
			System.out.println("exiting submenu");
			break;
		}
		
		switch (n) {
		case 1:
			System.out.println("enter the numbers");
			double num1 = sc.nextDouble();
			double num2 = sc.nextDouble();
			System.out.println(Math.abs(num1 - num2));
			break;

		case 2:
			System.out.println("enter the numbers");
			double num11 = sc.nextDouble();
			double num21 = sc.nextDouble();
			double num31 = sc.nextDouble();
			System.out.println(Math.abs(num11 - num21 - num31));
			break;
		case 3:
			System.out.println("enter the numbers");
			double num12 = sc.nextDouble();
			double num22 = sc.nextDouble();
			double num32 = sc.nextDouble();
			double num42 = sc.nextDouble();
			System.out.println(Math.abs(num12 - num22 - num32 - num42));
			break;
		
		default:

			System.out.println("INVALID INPUT");

		}
		}
	}

	public static void mulMenu() {
		Scanner sc = new Scanner(System.in);
		boolean flag=true;
		while(flag) {
		System.out.println("enter 1 for 2 numbers, 2 for 3 numbers, 3 for 4 numbers,5 for exit,6 for continue");
		int n = sc.nextInt();
		if(n==5) {
			System.out.println("exiting multi menu");
			break;
		}
		switch (n) {
		case 1:
			System.out.println("enter the numbers");
			double num1 = sc.nextDouble();
			double num2 = sc.nextDouble();
			System.out.println(num1 * num2);
			break;

		case 2:
			System.out.println("enter the numbers");
			double num11 = sc.nextDouble();
			double num22 = sc.nextDouble();
			double num32 = sc.nextDouble();
			System.out.println(num11 * num22 * num32);
			break;
		case 3:
			System.out.println("enter the numbers");
			double num12 = sc.nextDouble();
			double num21 = sc.nextDouble();
			double num31 = sc.nextDouble();
			double num41 = sc.nextDouble();
			System.out.println(num12 * num21 * num31 * num41);
			break;
		default:

			System.out.println("INVALID INPUT");

		}
		}
	}

	public static void div() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the numbers");
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		if (num2 == 0)
			System.out.println("ARITHMETic exception");
		else
			System.out.println(num1 / num2);

	}
}
