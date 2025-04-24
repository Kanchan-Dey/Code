package exceptionhandlingpractice;

import java.util.Scanner;

public class ATMDriver {
    public static void main(String[] args) {
    	Scanner sc= new Scanner(System.in); 
     
    	System.out.println("Enter the password");
    	String password = sc.nextLine();
    	ATM a= new ATM(1000,password);
    	a.checkPassword(password);
		try {
		a.withdraw();
		}
		catch(InsufficientBalanceException e){
			System.out.println("Insufficient balance exception");
		}
		catch(InvalidPasswordException e)
		{
			System.out.println("Invalid password");
		}
		
	}
}
