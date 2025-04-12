package hashmap;

import java.util.Scanner;
	public class Main {
		

		
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        SimpleHashMap map = new SimpleHashMap();
		        
		        System.out.println("Simple HashMap Operations");
		        System.out.println("-------------------------");
		        
		        while (true) {
		            System.out.println("\nChoose an operation:");
		            System.out.println("1. Put (Add/Update key-value pair)");
		            System.out.println("2. Get (Retrieve value by key)");
		            System.out.println("3. Remove (Delete key-value pair)");
		            System.out.println("4. Check if key exists");
		            System.out.println("5. Display all entries");
		            System.out.println("6. Get size of map");
		            System.out.println("7. Exit");
		            System.out.print("Enter your choice (1-7): ");
		            
		            int choice;
		            try {
		                choice = Integer.parseInt(scanner.nextLine());
		            } catch (NumberFormatException e) {
		                System.out.println("Invalid input. Please enter a number between 1-7.");
		                continue;
		            }
		            
		            switch (choice) {
		                case 1:
		                    System.out.print("Enter key: ");
		                    Object putKey = scanner.nextLine();
		                    System.out.print("Enter value: ");
		                    Object putValue = scanner.nextLine();
		                    map.put(putKey, putValue);
		                    System.out.println("Added/Updated: [" + putKey + "=" + putValue + "]");
		                    break;
		                    
		                case 2:
		                    System.out.print("Enter key to get: ");
		                    Object getKey = scanner.nextLine();
		                    Object value = map.get(getKey);
		                    if (value != null) {
		                        System.out.println("Value for '" + getKey + "': " + value);
		                    } else {
		                        System.out.println("Key '" + getKey + "' not found");
		                    }
		                    break;
		                    
		                case 3:
		                    System.out.print("Enter key to remove: ");
		                    Object removeKey = scanner.nextLine();
		                    Object removedValue = map.remove(removeKey);
		                    if (removedValue != null) {
		                        System.out.println("Removed: [" + removeKey + "=" + removedValue + "]");
		                    } else {
		                        System.out.println("Key '" + removeKey + "' not found");
		                    }
		                    break;
		                    
		                case 4:
		                    System.out.print("Enter key to check: ");
		                    Object containsKey = scanner.nextLine();
		                    boolean exists = map.containsKey(containsKey);
		                    System.out.println("Key '" + containsKey + "' " + (exists ? "exists" : "does not exist"));
		                    break;
		                    
		                case 5:
		                    System.out.println("HashMap contents:");
		                    map.display();
		                    break;
		                    
		                case 6:
		                    System.out.println("Current size of map: " + map.size());
		                    break;
		                    
		                case 7:
		                    System.out.println("Exiting program...");
		                    scanner.close();
		                    System.exit(0);
		                    break;
		                    
		                default:
		                    System.out.println("Invalid choice. Please enter a number between 1-7.");
		            }
		        }
		    }
		}
	
