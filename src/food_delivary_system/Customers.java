package food_delivary_system;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Customers {
	private String name;
	private int id;
	private int password;

	List<Resturant> resturas;
   Scanner sc = new Scanner(System.in);
	Customers(String name, int id, int password) {
		this.name = name;
		this.id = id;
		this.password = password;

		this.resturas = new ArrayList<Resturant>();
	}

	public void addRestaurants(Resturant resturant, int password) {
		if (this.password == password) {
			

				System.out.println("You are logged in");
				this.resturas.add(resturant);
				int n=0;
				while(n<5) {
					
				resturant.items.add(new Item(sc.nextLine(), sc.nextInt()));
				n++;
				}
				if(n>5)
				{
					throw new OrderLimitExceedException();
				}
			}
				

			
		 else {
			System.out.println("Wrong password");
		}
	}



	public void display() {
		System.out.println(this.resturas);
	}
}
