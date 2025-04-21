package hashset_collection;

import java.util.HashSet;

public class StudentDriver {
public static void main(String[] args) {
	HashSet<Student> hs = new HashSet<Student>();
	hs.add(new Student("TUNG TUNG TUNG TUNG SAHUR",1));
	hs.add(new Student("TRALALERO TRALALA",2));
	hs.add(new Student("TRALALERO TRALALA",2));
	hs.add(new Student("BOMBARDINO CROCODILO",1));
	hs.add(new Student("LIRILI LARILA",3));
	System.out.println(hs);
}
}
