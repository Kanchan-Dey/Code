package relational_operators;

import java.util.Scanner;

public class RelationalOperators {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
			if(num>=0 && num%2==0)
			{
				System.out.println("POSitive even");
			}
			else if(num<0 && num%2==0)
			{
				System.out.println("neg even");
			}
			else if(num>0 && num%2!=0)
			{
				System.out.println("Postive odd");
			}
			else if(num<0 && num%2!=0)
			{
				System.out.println("negative odd");
			}
 }
}
