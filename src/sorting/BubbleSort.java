package sorting;

import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter the size");
       int n=sc.nextInt();
       int[] arr = new int[n];
       System.out.println("Enter the array elements");
       for(int i=0;i<n;i++)
       {
    	   arr[i]=sc.nextInt();
       }
       System.out.println("Original Array");
       for(int i:arr)
       {
    	  
    	   System.out.println(i);
       }
       int temp=0;
       for(int i=0;i<n;i++)
       {
    	   for(int j=0;j<n-1-i;j++)
    	   {
    		   if(arr[j]>arr[j+1])
    		   {
    			   temp=arr[j];
    			   arr[j]=arr[j+1];
    			   arr[j+1]=temp;
    		   }
    	   }
       }
       System.out.println("Sorted array");
       for(int i:arr)
       {
    	   System.out.println(i);
       }
	}
}
