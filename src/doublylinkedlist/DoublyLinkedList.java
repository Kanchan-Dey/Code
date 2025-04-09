package doublylinkedlist;

public class DoublyLinkedList {
	Node head;
    Node tail;
    int count;
    public void insert(int data) {
        Node node = new Node(data);

        if (head == null) {  // Empty list case
            head = node;
            tail = node;
        } else {
            tail.next = node; // Tail points to the new node
            node.prev = tail; // New node points back to the current tail
            tail = node;      // Update the tail to the new node
        }
        count++; // Increment node count
    }
    public void display() {
        if (head == null) {
            System.out.println("Empty List");
            return;
        }

        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
    public void update(int posi, int data) {
        if (posi < 1 || posi > count) {
            System.out.println("Invalid position");
            return;
        }

        Node curr = head;
        for (int i = 1; i < posi; i++) {
            curr = curr.next; // Traverse to the node at position posi
        }
        curr.data = data;  // Update data at the found position
    }

    // Insert a node at a specific position
    public void insertAtAny(int posi, int data) {
        if (posi < 1 || posi > count + 1) {
            System.out.println("Invalid position");
            return;
        }

        Node node = new Node(data);

        // If inserting at the beginning (position 1)
        if (posi == 1) {
            node.next = head;
            if (head != null) {
                head.prev = node;
            }
            head = node;
            if (tail == null) {
                tail = node;  // If the list was empty
            }
        } else {
            Node curr = head;
            for (int i = 1; i < posi - 1; i++) {
                curr = curr.next; // Traverse to the node just before the target position
            }
            node.next = curr.next;  // The new node points to the next node
            if (curr.next != null) {
                curr.next.prev = node;  // The next node's previous pointer is updated to the new node
            }
            curr.next = node;  // The current node points to the new node
            node.prev = curr;  // The new node points back to the current node
            if (node.next == null) {
                tail = node;  // If inserted at the end, update the tail pointer
            }
        }

        count++;  // Increment the node count
    }

    // Delete a node at a specific position
    public void deleteAtAny(int posi) {
        if (head == null) {
            System.out.println("Empty list");
            return;
        }

        if (posi < 1 || posi > count) {
            System.out.println("Invalid position");
            return;
        }

        // Deleting the first node (head)
        if (posi == 1) {
            System.out.println(head.data + " is deleted");
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null;
                // If the list becomes empty after deletion
            }
        } else {
            Node curr = head;
            for (int i = 1; i < posi; i++) {
                curr = curr.next; // Traverse to the node to delete
            }
            System.out.println(curr.data + " is deleted");

            // Adjust the pointers to bypass the node to be deleted
            if (curr.next != null) {
                curr.next.prev = curr.prev;
            }
            if (curr.prev != null) {
                curr.prev.next = curr.next;
            }

            // If the node is the tail, update the tail pointer
            if (curr == tail) {
                tail = curr.prev;
            }
        }

        count--;  // Decrease the node count
    }
}
