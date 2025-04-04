package comparableandcomparatorinterface;

import java.util.Arrays;

public class DogDriver {
	public static void main(String[] args) {
		Dog arr[] = new Dog[3];
		arr[0] = new Dog("alpha", 10,"al");
		arr[1] = new Dog("beta", 9,"cl");
		arr[2] = new Dog("turjo", 8,"bl");
		
		Arrays.sort(arr);// we get a classcast exception because for a non primitive object that has not implemented comparable method it does not understand how to sort based on which value of the object as the compareto method is not overriden
	   
		for (Dog i : arr) {
			
			System.out.println(i);
		}
		CompareByBreed b1= new CompareByBreed();
		Arrays.sort(arr,b1);// we have to do this because the sort method internally calls compareTo. P.S. This is a different Arrays.sort() than we normally use
		for(Dog i:arr)
		{
			System.out.println(i);
		}
	}

}
