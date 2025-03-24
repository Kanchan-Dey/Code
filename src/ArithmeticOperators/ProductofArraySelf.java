package ArithmeticOperators;

public class ProductofArraySelf {
   public static void main(String[] args) {
	int array[]= {0,4,5,6};
	int product=0;
	for(int i=0;i<3;i++)
	{
		if(array[i]==0)
			continue;
		product*=array[i];
	}
	int result[]=new int[3];
	for(int i=0;i<3;i++)
	{
		if(array[i]==0) {
			continue;
		
	}
		result[i]=product/array[i];}
}
}
