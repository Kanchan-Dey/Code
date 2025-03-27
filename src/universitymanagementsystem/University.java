package universitymanagementsystem;

import onetomany.Customer;

public class University {
	
	private Person[] persons;//customer array reference
	private static int count=0;//just a count variable so we dont need a copy of it in our objects , as we are dealing with one bank it can be static
	public University(int size)
	{
		this.persons= new Person[size];//creating the object
		
	}
	public void  addPerson(Person person)//for adding our customers in a customer array we need a customer object given by the user
	{
		if(count<persons.length)
		{
			persons[count++]=person;//reassinging the value from null to customer objects
			System.out.println("person added");
		}
		else
		{
			System.out.println("person not added");
		}
	}
	public void showPeople()
	{
		for(Person p: persons)
		{
			if(p instanceof Professor)
			{
			((Professor)p).displayInfo();
			}
			else if(p instanceof Student)
			{
				((Student)p).displayInfo();
			}
			else
			{
				System.out.println("no person");
			}
		}
	}
}
