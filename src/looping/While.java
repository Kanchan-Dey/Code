package looping;

import java.util.Scanner;

public class While
{
public static void main(String[] args) {
	

	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
	int num=sc.nextInt();
	int originalnum=num;
	int sum=0;
	int temp;
	while(num>0)
	{
	temp=num%10;
	sum+=(int)Math.pow(temp,3);
	num=num/10;
	}
	if(sum==originalnum) {
	System.out.println("true");
	}
	else {
	System.out.println("false");}
	
}
}
