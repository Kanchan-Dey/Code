package food_delivary_system;

import java.util.ArrayList;
import java.util.List;

public class Resturant {
 private String name;
 private int pin;
 List<Item> items;
 Resturant(String name,int pin)
 {
	 setName(name);
	 setPin(pin);
    this.items=new ArrayList<Item>();
 }

 public void setName(String name)
 {
	 this.name=name;
	 
 }
 public String getName()
 {
	 return name;
 }
 public void setPin(int pin)
 {
	 this.pin=pin;
	 
 }
 public int getPin()
 {
	 return pin;
 }
 public String toString()
 {
	 return getName() +" "+ items;
 }
}
