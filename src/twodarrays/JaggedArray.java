package twodarrays;

import java.util.Scanner;

public class JaggedArray {
public static void main(String[] args) {
	jagged();
}
public static void jagged()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the array size rows");
	int m=sc.nextInt();
	int n=0;
	int[][] arr = new int[m][];
	for(int i=0;i<m;i++)
	{
		System.out.println("enter the array size columns");
		n=sc.nextInt();
		arr[i]=new int[n];
	}
	System.out.println("ENTER THE ARRAY ELEMENTS");
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<arr[i].length;j++)
		{
			arr[i][j]=sc.nextInt();
		}
	}
	for(int i=0;i<m;i++) {
		for(int j=0;j<arr[i].length;j++) {
	System.out.print(arr[i][j]);
	}
		System.out.println();
		}
}
}
