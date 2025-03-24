package twodarrays;

import java.util.Scanner;

public class TwoDimenExample {
	public static void main(String[] args) {
		// max(input());
		//symmetry(input());
		transpose(input());
	}

	public static int[][] input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no. of rows and columns");
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][m];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}

		}
		return arr;
	}

	public static void max(int[][] arr) {
		int max = 0;
		for (int[] i : arr) {
			for (int j : i) {
				if (j > max)
					max = j;
			}

		}
		System.out.println(max);
	}

	public static void symmetry(int[][] arr) {
		int flag = 0;
		for (int i = 0; i < arr.length; i++) {
			if (flag == 0) {
				for (int j = 0; j < arr[i].length; j++) {
					if (arr[i][j] != arr[j][i]) {
						flag = 1;
						break;
					}
				}
			}
		}
		if (flag == 0) {
			System.out.println("SYMMETRIC");
		}

	}
	public static void transpose(int[][] arr)
	{for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {
				arr[j][i]=arr[i][j];
			}
	}
	for(int[] i: arr)
	{
		for(int j:i)
		{
			System.out.print(j+" ");
		}
		System.out.println();
	}
	}
}
