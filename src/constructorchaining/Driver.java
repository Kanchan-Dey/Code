package constructorchaining;

public class Driver {
   public static void main(String[] args) {
	  Child c= new Child("TATA","V8",18);
	  System.out.println(c.name+ " " + c.bloodType + " "+ c.age);
}
}
