package methods;

public class AccessMethods {
public static void main(String[] args) {
	int arr[]= {1,2,3,4,5};
	int target=2;
	int res=search(arr,target);
	System.out.println(res);
}
public static int search(int arr[],int key)
{
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]==key)
		{
			return i;
		}
	}
	System.out.println("element not found");
	return -1;
}
}