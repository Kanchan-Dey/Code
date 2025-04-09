package singlylinkedlist;

public class Singly_Linked_List {
   Node head;//fixed to the first node.
   Node tail;//fixed to the last node
   static int count;//to count the number of nodes
   public void insert(int data)
   {
	   Node node = new Node(data);//creating a node object
	   if(head==null)//checking if the head points to a node in the linkedlist(checking if nodes are created or not)
	   {
		   head=node;//head stores first node
		   tail=node;//tail stores first node(which is the last node atm)
		   count++;//counter becomes 1
	   }
	   else
	   {
		   tail.next=node;//connecting the 2nd node to the first node
		   tail=node;//changing the tail pointer to store the next node 
		   count++;//counting the other nodes
	   }
   }
  
   public void display()
   {
	   int i=0;
	   Node now= head;//pointing the now to the first node
	   if(head==null)
	   {
		   System.out.print("No data to display");
		
	   }
	   else
	   {
	   while(i<count)//counting
	   {
		  System.err.println(now.data);//printing the data
		  now= now.next;//reinitializing to store the next node
		  i++;//increementing to iterate
	   }
	   }
   }
   public void update(int posi,int data)
   {
	   if(posi<1 || posi>count)
	   {
		   System.out.println("invalid position");
		   return;
	   }
	   else if(posi==1)
	   {
		   head.data=data;
		   return;
	   }
	   else if(posi==count)
	   {
		   tail.data=data;
		   return;
	   }
	   else if(head==null)
	   {
		   return;
	   }
	   else
	   {
		   
		   Node curr=head;
		   for(int i=1;i<count;i++)
		   {
			   curr=curr.next;
		
			   return;
		   
		   }
		   curr.data=data;
	   }
   }
   public void insertAtAnyPosi(int posi,int data)
   {
	   if(posi==1)
	   {
		   Node node = new Node(data);
		   node.next=head;
		   head=node;
		   count++;
	    return;
	   }
	   if(posi!=0 && posi<=count)
	   {
		   Node node = new Node(data);
		   Node curr=head;
		   int i=1;
		   if(head==null) {
			   head=node;
			   tail=node;
			   count++;
			   return;
		   }
		   
		   else
		   {
			   while(i++<posi-1)
			   {
				   curr=curr.next;
			   }
			   node.next=curr.next;
			   curr.next=node;
			   count++;
			   return;
		   }
	   }
	   System.out.println("Not a valid position");
   }
   public void delete()
   {
	   if(head==null)
	   {
		   System.out.println("Empty list");
		   return;
	   }
	   System.out.println(head.data+"is deleted");
	   Node curr=head;
	   head=head.next;
	   curr.next=null;
	   count--;
	   return;
   }
   public void deleteAtAny(int posi)
   {
	   if(head==null)
	   {
		   System.out.println("Empty list");
		   return;
	   }
	   if(posi!=0 && posi<=count)
	   {
		   int i=1;
		   Node curr=head;
		   while(i++<posi-1)
		   {
			   curr=curr.next;
		   }
		   System.out.println(curr.next.data+"is deleted");
		   curr.next=curr.next.next;
		   count--;
		   return;
	   }
	   System.out.println("Invalid position");
   }
}
