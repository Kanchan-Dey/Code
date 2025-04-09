package doublylinkedlist;
import java.util.*;
public class Driver {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        DoublyLinkedList list = new DoublyLinkedList();
	        int choice, data, posi;

	        do {
	            System.out.println("\nDoubly Linked List Menu:");
	            System.out.println("1. Insert at End");
	            System.out.println("2. Display List");
	            System.out.println("3. Update a Node");
	            System.out.println("4. Insert at Any Position");
	            System.out.println("5. Delete at Any Position");
	            System.out.println("6. Exit");
	            System.out.print("Enter your choice: ");
	            choice = scanner.nextInt();

	            switch (choice) {
	            case 1:
                    System.out.print("Enter data to insert at end: ");
                    data = scanner.nextInt();
                    list.insert(data);
                    System.out.println(data + " inserted at the end.");
                    break;
                case 2:
                    System.out.println("Displaying List:");
                    list.display();
                    break;
                case 3:
                    System.out.print("Enter position to update: ");
                    posi = scanner.nextInt();
                    System.out.print("Enter new data: ");
                    data = scanner.nextInt();
                    list.update(posi, data);
                    break;
                case 4:
                    System.out.print("Enter position to insert: ");
                    posi = scanner.nextInt();
                    System.out.print("Enter data to insert: ");
                    data = scanner.nextInt();
                    list.insertAtAny(posi, data);
                    break;
                case 5:
                    System.out.print("Enter position to delete: ");
                    posi = scanner.nextInt();
                    list.deleteAtAny(posi);
                    break;
                case 6:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
                    break;
            }
        } while (choice != 6);
	            
	  }
}
	       
	


