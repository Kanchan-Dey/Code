package composition;

public class Phone {
String phoneName;
Battery b;
public Phone(String phoneName,String BatteryType)
{
	this.phoneName=phoneName;
	this.b= new Battery(BatteryType);
	
}
public void display()
{
	System.out.println(phoneName + " " + b.BatteryType);
}
}
