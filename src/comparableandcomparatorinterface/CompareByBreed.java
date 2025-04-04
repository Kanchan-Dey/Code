package comparableandcomparatorinterface;

import java.util.Comparator;

public class CompareByBreed implements Comparator<Dog> {

	@Override
	public int compare(Dog o1, Dog o2) {
		// TODO Auto-generated method stub
		return o1.breed.compareTo(o2.breed);
	}
	

}
