package circularsinglylinkedlist;

public class CircularSinglyLinkedlist {
	Node head;
	Node tail;
	int count;

	public void insert(int data) {
		Node node = new Node(data);// Step 1: Create a new Node
		if (head == null)// Step 2: If the list is empty
		{
			head = node;// 1st node becomes head
			tail = node;// 1st node becomes tail as there is only one node
			tail.next = head;// tail points back to head for circular
			count++;// counting
		} else {
			tail.next = node;// Current Tail points to the new Node
			tail = node;// new node becomes the tail
			tail.next = head;// this tail points back to head
			count++;// counting
		}

	}

	public void display() {
		int i = 0;
		Node curr = head;// initializing curr to head
		if (head == null)// check if list is empty
		{
			System.out.println("Empty List");
			return;
		}
		do// running a loop
		{
			System.out.println(curr.data);// prints the data from the current node
			curr = curr.next;// it becomes the next node in the list if any

		} while (curr != head);
	}

	public void update(int posi, int data) {
		if (posi < 1 || posi > count) {
			System.out.println("Invalid position");
			return;
		}
		if (posi == 1) {
			head.data = data;
			return;
		}
		if (posi == count) {
			tail.data = data;
			return;
		}
		if (posi > 1 && posi < count) {
			Node curr = head;
			for (int i = 1; i < posi-1; i++) {

				curr = curr.next;// curr stores the next node

			}
			curr.next.data = data;// the node contains the data
			return;
		}
	}

	public void insertAtAny(int posi, int data) {
		// Create a new node with the provided data
		Node node = new Node(data);

		// Check if the position is 1, meaning the insertion is at the beginning of the
		// list
		if (posi == 1) {
			// If the list is empty (head is null), set both head and tail to the new node
			if (head == null) {
				head = tail = node;
				node.next = head; // Make the list circular
			} else {
				// If the list is not empty, insert the new node at the beginning
				node.next = head; // The new node points to the current head
				head = node; // The head is updated to the new node
				tail.next = head; // Ensure the tail still points to the head, maintaining the circular structure
			}
			count++; // Increment the node count
			System.out.println(count);
			return; // Exit the method as the insertion is complete
		}

		// Check if the position is invalid (less than 1 or greater than the current
		// count)
		if (posi < 1 || posi > count) {
			System.out.println("Invalid position"); // Print an error message for an invalid position
			return; // Exit the method without making changes
		} else {
			// If the position is valid, traverse the list to find the node just before the
			// insertion position
			Node curr = head;
			for (int i = 1; i < posi - 1; i++) {
				curr = curr.next; // Move to the next node until we reach the node before the target position
			}

			// Insert the new node by adjusting the pointers
			node.next = curr.next; // The new node points to the node after the current node
			curr.next = node; // The current node points to the new node

			// If we are inserting at the last position (just after the current tail)
			if (posi == count + 1) {
				tail = node; // Update the tail to the new node
				tail.next = head; // Ensure the tail points back to the head, maintaining the circular structure
			}
		}

		count++;
		System.out.println(count);// Increment the node count
	}

	public void deleteAtAny(int posi) {
		if (head == null) {
			System.out.println("Empty list");
			return;
		}

		// If the position is valid (1 <= posi <= count)
		if (posi > 0 && posi <= count) {
			// Case when deleting the head node (position 1)
			if (posi == 1) {
				// If there's only one node
				if (head.next == head) {
					System.out.println(head.data + " is deleted");
					head = null;
				} else {
					// Find the last node to update its next pointer to the new head
					Node last = head;
					while (last.next != head) {// iterating to the last element of the list
						last = last.next;// using this
					}
					System.out.println(head.data + " is deleted");
					head = head.next;// making the second element the head node
					last.next = head;// pointing the last node to the newly created head node
				}
			} // General case (not deleting the head node)
			else {
				int i = 1; // Initialize a counter to traverse the list, starting from position 1
				Node curr = head; // Start from the head of the circular linked list

				// Traverse the list to reach the node just before the one to be deleted
				// (position - 1)
				while (i++ < posi - 1) {
					curr = curr.next; // Move to the next node
				}

				// At this point, curr is the node just before the one to be deleted.
				// We print the data of the node that is going to be deleted.
				System.out.println(curr.next.data + " is deleted");

				// Update the 'next' pointer of curr to bypass the node to be deleted.
				// This effectively removes curr.next from the list.
				curr.next = curr.next.next; // Skip the node that needs to be deleted, linking curr to the next node

				// After deletion, reduce the total count of nodes in the circular linked list
				count--;
			}

		} else {
			System.out.println("Invalid position");
		}
	}

}
