package casestudies;

public class Professor1 extends Person1{
private String specs;
Professor1(String name,int age,String specs)
{
	super(name,age);
	setSpecs(specs);
}
private void setSpecs(String specs)
{
	this.specs=specs;
}
private String getSpecs()
{
	return specs;
}
public void displayProfessorInfo()
{
	super.DisplayInfo();
	System.out.println("SPECIALIZATION"+ specs);
}
}
