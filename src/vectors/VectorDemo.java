package vectors;
import java.util.Vector;
public class VectorDemo {
	

	
	    public static void main(String[] args) {
	        // Create a Vector
	        Vector<String> vector = new Vector<>();
	        
	        // Add elements
	        vector.add("Apple");
	        vector.add("Banana");
	        vector.addElement("Cherry"); // Legacy method
	        
	        // Access elements
	        System.out.println("First element: " + vector.firstElement());
	        System.out.println("Element at index 1: " + vector.get(1));
	        
	        // Remove elements
	        vector.remove("Banana");
	        vector.removeElementAt(0);
	        
	        // Size and capacity
	        System.out.println("Size: " + vector.size());
	        System.out.println("Capacity: " + vector.capacity());
	        
	        // Iterate through Vector
	        for (String fruit : vector) {
	            System.out.println(fruit);
	        }
	    }
	}

