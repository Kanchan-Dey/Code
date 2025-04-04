package comparableandcomparatorinterface;

import java.util.Arrays;

public class Dog implements Comparable {
	String name;
	int age;
	String breed;

	public Dog(String name, int age,String breed) {
		this.name = name;
		this.age = age;
	    this.breed= breed;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + "breed= "+ breed+ "]";
	}

	
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Dog d= (Dog)o;
		int namecompare = this.name.compareTo(d.name);
		if(namecompare!=0)
		{
			return namecompare;
		}
		if(this.age-d.age!=0) {   // return Integer.compare(this.age,e.age);
		return this.age-d.age;
		}
		return 0;
	}
}
