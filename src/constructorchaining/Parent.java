package constructorchaining;

public class Parent {
	String name="lamcjam";
	String bloodType;
   public Parent(String name,String bloodType) {//there is a super() added by default here as well which refers to the object class which is a predefined class.IT is the supermost class of all classes.
	 
	   
	   super();// because object class only has no args constructors.
	  this.name=name;
	this.bloodType=bloodType;
	  
	

   }
   public Parent(String name)
   {
	  this.name=name;
   }
}
