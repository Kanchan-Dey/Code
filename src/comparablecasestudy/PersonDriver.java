package comparablecasestudy;

public class PersonDriver {
public static void main(String[] args) {
	Person p1= new Person("Rohit",24);
	Person p2= new Person("Rohit",26);
	System.out.println(p1);
	System.out.println(p2);
	if(p1.compareTo(p2)>0)
	{
		System.out.println("Person1 is older");
	}
	else if(p1.compareTo(p2)<0)
	{
		System.out.println("Person 2 is older");
	}
	else
	{
		System.out.println("Same age and same name");
	}
		
}
}
