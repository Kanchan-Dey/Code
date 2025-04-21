package casestudies;

public class Person1 {
private String name;
private int age;
Person1(String name,int age)
{
	setName(name);
	setAge(age);
}
private void setName(String name)
{
	this.name=name;
}
private String getName()
{
	return name;
}
private void setAge(int age)
{
	this.age=age;
}
private int getAge()
{
	return age;
}
public void DisplayInfo()
{
	System.out.println("age"+ " "+ getAge());
	System.out.println("name"+ " "+getName());
}
}
