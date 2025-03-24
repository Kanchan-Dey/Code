package twodarrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimenArraysUsingArraysClass {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
		System.out.println("enter the no. of rows and columns");
		int n=sc.nextInt();
		int m=sc.nextInt();
		 int[][] arr= new int[n][m];
		 for(int i=0;i<arr.length;i++)
		 {
			 for(int j=0;j<arr[i].length;j++) {
				 arr[i][j]=sc.nextInt();
			 }
		 
		 }
		 System.out.println(Arrays.deepToString(arr));
	}
}
