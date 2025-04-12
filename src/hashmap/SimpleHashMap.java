package hashmap;

public class SimpleHashMap {
	private static final int DEFAULT_SIZE = 16;

	// Node for our linked list
	private static class Node {
		Object key;
		Object value;
		Node next;

		Node(Object key, Object value) {
			this.key = key;
			this.value = value;
			this.next = null;
		}
	}

	private Node[] table;
	private int size;

	public SimpleHashMap() {
		this(DEFAULT_SIZE);
	}

	public SimpleHashMap(int initialSize) {
		table = new Node[initialSize];
		size = 0;
	}

	// Simple hash function
	private int hash(Object key) {
		return Math.abs(key.hashCode()) % table.length;
	}

	// Add or update a key-value pair
	public void put(Object key, Object value) {
		int index = hash(key);
		Node newNode = new Node(key, value);

		// If bucket is empty, just add the new node
		if (table[index] == null) {
			table[index] = newNode;
		} else {
			// Check if key already exists
			Node current = table[index];
			Node prev = null;

			while (current != null) {
				if (current.key.equals(key)) {
					// Update existing value
					current.value = value;
					return;
				}
				prev = current;
				current = current.next;
			}

			// Add new node at end of chain
			prev.next = newNode;
		}

		size++;
	}

	// Get value for a key
	public Object get(Object key) {
		int index = hash(key);
		Node current = table[index];

		while (current != null) {
			if (current.key.equals(key)) {
				return current.value;
			}
			current = current.next;
		}

		return null; // Key not found
	}

	// Remove a key-value pair
	public Object remove(Object key) {
		int index = hash(key);
		Node current = table[index];
		Node prev = null;

		while (current != null) {
			if (current.key.equals(key)) {
				if (prev == null) {
					// Remove first node in chain
					table[index] = current.next;
				} else {
					prev.next = current.next;
				}
				size--;
				return current.value;
			}
			prev = current;
			current = current.next;
		}

		return null; // Key not found
	}

	public void display() {

		for (int i = 0; i < table.length; i++) {
			System.out.print("Bucket " + i + ": ");
			Node current = table[i];
			while (current != null) {
				System.out.print("[" + current.key + "=" + current.value + "] ");
				current = current.next;
			}
			System.out.println();
		}
	}

	public boolean containsKey(Object key) {
		return get(key) != null;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}
}
