package constructorchaining;

public class Child extends Parent{
	int age;
   public Child(String name,String bloodType,int age) {//this constructor contains a super() statement added by the compiler
    	super(name,bloodType);
    this.age=age;
    	
    	System.out.println("child constructor");
    }
}
