package treemaps;

import java.util.*;
import java.util.Map.Entry;

public class TreeMapDemo {
    public static void main(String[] args) {
        // 1. Create TreeMap with natural ordering
        TreeMap<Integer, String> tm = new TreeMap<>();
        
        // 2. Basic operations
        tm.put(1, "Apple");
        tm.put(2, "Banana");
        tm.put(3, "Cherry");
        tm.put(4, "Date");
        tm.put(5, "Elderberry");
        tm.put(6, null); // Adding null value
        
        System.out.println("Original TreeMap: " + tm);
        
        // 3. Get operations
        System.out.println("\nGet operations:");
        System.out.println("Value for key 3: " + tm.get(3));
        System.out.println("Value for key 7: " + tm.get(7));
        System.out.println("First key: " + tm.firstKey());
        System.out.println("Last key: " + tm.lastKey());
        
        // 4. Contains checks
        System.out.println("\nContains checks:");
        System.out.println("Contains key 4? " + tm.containsKey(4));
        System.out.println("Contains value 'Banana'? " + tm.containsValue("Banana"));
        
        // 5. Remove operations
        System.out.println("\nRemove operations:");
        System.out.println("Removed value for key 2: " + tm.remove(2));
        System.out.println("After removal: " + tm);
        
        // 6. Replace operations
        System.out.println("\nReplace operations:");
        tm.replace(3, "Updated Cherry");
        System.out.println("After replace: " + tm);
        
        // 7. Navigation methods
        System.out.println("\nNavigation methods:");
        System.out.println("Lower key for 4: " + tm.lowerKey(4));
        System.out.println("Floor key for 4: " + tm.floorKey(4));
        System.out.println("Higher key for 4: " + tm.higherKey(4));
        System.out.println("Ceiling key for 4: " + tm.ceilingKey(4));
        
        // 8. Submap views
        System.out.println("\nSubmap views:");
        System.out.println("HeadMap (keys < 4): " + tm.headMap(4));
        System.out.println("TailMap (keys >= 4): " + tm.tailMap(4));
        System.out.println("SubMap (3 <= keys < 5): " + tm.subMap(3, 5));
        
        // 9. Iteration methods
        System.out.println("\nIterating through keys:");
        Set<Integer> keySet = tm.keySet();
        Iterator<Integer> keyIterator = keySet.iterator();
        while(keyIterator.hasNext()) {
            System.out.println(keyIterator.next());
            System.out.println("---");
        }
        
        System.out.println("\nIterating through values:");
        Collection<String> values = tm.values();
        Iterator<String> valueIterator = values.iterator();
        while(valueIterator.hasNext()) {
            System.out.println(valueIterator.next());
            System.out.println("---");
        }
        
        System.out.println("\nIterating through entries:");
        Set<Entry<Integer, String>> entrySet = tm.entrySet();
        Iterator<Entry<Integer, String>> entryIterator = entrySet.iterator();
        while(entryIterator.hasNext()) {
            Entry<Integer, String> entry = entryIterator.next();
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
            System.out.println("---");
        }
        
        // 10. For-each alternatives
        System.out.println("\nUsing for-each loop:");
        for(Entry<Integer, String> entry : tm.entrySet()) {
            System.out.println(entry);
        }
        
        System.out.println("\nUsing forEach method:");
        tm.forEach((key, value) -> System.out.println(key + " => " + value));
        
        // 11. Size and clear
        System.out.println("\nSize operations:");
        System.out.println("Current size: " + tm.size());
        tm.clear();
        System.out.println("After clear, size: " + tm.size());
        System.out.println("Is empty? " + tm.isEmpty());
        
        // 12. Null key attempt
        try {
            tm.put(null, "Will fail");
        } catch (NullPointerException e) {
            System.out.println("\nCannot add null key to TreeMap: " + e);
        }
    }
}