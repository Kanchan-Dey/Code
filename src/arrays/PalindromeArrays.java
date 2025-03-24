package arrays;

import java.util.Scanner;

public class PalindromeArrays {
public static void main(String[] args) { 
	checkPalindrome(inputArray());
}
public static int[] inputArray()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the no.");
	int n=sc.nextInt();
	int[] arr= new int[n];
	System.out.println("enter the array elements");
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	return arr;
   
	
}
public static void  checkPalindrome(int[] arr) {
	int temp=0;

	for(int i=0;i<arr.length;i++)
	{
		int rev=0;
		int origin=arr[i];
		while(arr[i]>0) {
		temp=arr[i]%10;
		rev=rev*10+temp;
		arr[i]=arr[i]/10;
		}
		if(rev==origin) {
			System.out.println("palindrome element");
		}
		else {
		     System.out.println("not palindrome");}
	}
}
}
