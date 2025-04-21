package food_delivary_system;

public class Item {
private String name;
private int price;
Item(String name,int price)
{
	setName(name);
	setPrice(price);
}
public void setName(String name)
{
	this.name=name;
}
public String getName()
{
	return name;
}
public void setPrice(int price)
{
	this.price=price;
}
public int getPrice()
{
	return price;
}
public String toString()
{
	 return getName()+" "+getPrice();
}
}
