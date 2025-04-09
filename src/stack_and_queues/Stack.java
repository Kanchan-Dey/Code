package stack_and_queues;

public class Stack {
   static int top=-1;
   int[] arr;
   Stack(int[] arr)
   {
	   this.arr=arr;
   }
   public void push(int data)
   {
	   if(top<arr.length-1)
	   {
		   arr[++top]=data;
		 System.out.println(data+ " has been pushed");
	   }
	   else
	   {
		   System.out.println("Stack overflow");
	   }
	
   }
   public void pop()
   {
	   if(top!=-1)
	   {
		   System.out.println(arr[top] +" has been pushed from the list");
		   top--;
		   return;
	   }
	   else
	   {
		   System.out.println("stack underflow");
	   }
   }
   public void peek()
   {
	   if(top==arr.length)
	   {
		  System.out.println("Stack overflow");
	   }
	   if(top==-1)
	   {
		   System.out.println("Stack underflow");
	   }
	   System.out.println(arr[top]);
   }
   public void display()
   {
	   if(top==-1)
	   {
		   System.out.println("Stack underflow");
	   }
	   for(int i=0;i<=top;i++)
	   {
		   System.out.println(arr[i]);
	   }
   }
}
