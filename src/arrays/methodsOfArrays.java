package arrays;

import java.util.Arrays;

public class methodsOfArrays {
public static void main(String[] args) {
	int[] arr= {1,3,45,67,78};
	int[] nums= {2,5,1,3,8,4};
	int target=45;
	int target1=2;
	int i= Arrays.binarySearch(arr,target);
	int j= Arrays.binarySearch(arr,target1);
	System.out.println(i);
	System.out.println(j);
	/*int[] ar1r=Arrays.copyOf(arr,7);
	for(int k: ar1r)
	{
		System.out.println(k);
	}
	*/
	int[] ar1r=Arrays.copyOfRange(arr,0,3);
	for(int k: ar1r)
	{
		System.out.println(k);
	}
	System.out.println(arr.equals(ar1r));
	Arrays.sort(nums);
   System.out.println(Arrays.toString(nums));
}
}
