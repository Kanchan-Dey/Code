package food_delivary_system;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {

		Customers c1 = new Customers("kanchan", 1, 1234);
		boolean flag = true;
		while (flag) {
			Scanner sc = new Scanner(System.in);
			System.out.println("1 for adding resturant,3 for displaying");

			int ch = sc.nextInt();
			switch (ch) {

			case 1:
				c1.addRestaurants(new Resturant("KFC", 12), 1234);
				
				
				break;
			case 3:
				c1.display();
				break;
			default:
				System.out.println("Invalid choice");
			}
		}

	}
}
