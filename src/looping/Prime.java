package looping;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int flag=0;
		for(int i=2;i<=Math.sqrt(num);i++)
		{
			if(num%i==0) {
				System.out.println("Not prime");
			    flag=1;
			    break;
			}
			 
			    	
		}
		if(flag==0)
		{
			System.out.println("prime");
			System.out.print(sc.next());
			System.out.print(sc.nextLine());
		}
	}
}
