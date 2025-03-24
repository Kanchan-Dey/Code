package calculator;

import java.util.Scanner;

public class CalculatorApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean flag=true;
		
		while(flag==true) {
			System.out.println("Enter the operation 1 for add, 2 for sub, 3 for mul, 4 for div,5 for exit,6 for continue");
			int n = sc.nextInt();
			if(n==5) {
				System.out.println("exited calculator");
				break;
			}
		switch (n) {
		case 1:
			Calculator.addMenu();
			break;

		case 2:
			Calculator.subMenu();
			break;
		case 3:
			Calculator.mulMenu();
			break;
		case 4:
			Calculator.div();
			break;
		case 6:
			break;
		default:
			System.out.println("INVALID INPUT");

		}
		}
	}
}
