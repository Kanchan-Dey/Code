package casestudies;

public class University {

private int size;
private Person1[] people;
public University(int size)
{
	this.people= new Person1[size];

}
public static int count=0;
public void addPerson(Person1 p)
{
	if(count<people.length)
	{
		 people[count++] =p;
		 System.out.println("Person added succesfully");
	}
	else
	{
		System.out.println("Limit exceeeded");
	}
}
public void showPeople()
{
   for(Person1 p:people)
   {
	   if(p instanceof Professor1)
	   {
		  ((Professor1)p).displayProfessorInfo();
	   }
	   else if(p instanceof Student1)
	   {
		   ((Student1)p).displayStudentInfo();
	   }
   }
}
	
}
