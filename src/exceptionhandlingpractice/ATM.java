package exceptionhandlingpractice;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ATM {
	int balance;
	private String password;

	ATM(int balance, String password) {
		this.balance = balance;
		this.password = password;
	}

	public String getPassword() {
		return password;
	}
	Scanner sc = new Scanner(System.in);
	public boolean checkPassword(String password)
	{
		String regex = "(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!@#$%^&*])[A-Za-z0-9!@#$%^&*]{8,30}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher= pattern.matcher(password);
		if(matcher.find())
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	public void withdraw() throws InsufficientBalanceException, InvalidPasswordException {
       if(checkPassword(password)) {
		if (this.password == password) {
			
			System.out.println("Enter the amount to withdraw");
			int withdraw1 = sc.nextInt();
			if (withdraw1 > this.balance) {
				throw new InsufficientBalanceException("WITHDRAW MORE THAN BALANCE");
			} else {

				balance -= withdraw1;
				System.out.println("Current balance" + " " + balance);
			}
		} else {
			throw new InvalidPasswordException("Invalid password,Try again");
			
		}
	}
       else
       {
    	   System.out.println("Invalid password by regex");
       }
       }
	}


