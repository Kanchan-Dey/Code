package treesets;

import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		set.add(1);
		set.add(2);
		set.add(4);
		set.add(3);
		set.add(1);
		System.out.println(set);// this prints in ascending order, the tree set has compareTo method overriden
								// by default
	}
}
