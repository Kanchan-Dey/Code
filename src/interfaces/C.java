package interfaces;

public interface C extends A,B{
   default void check()
   {
	   System.out.println(A.a);
	   System.out.println(B.a);
	   //static methods are not inherited 
	   A.message();
	   B.message();
	   print();// we can directly call a default method from the parent class if only one of the parents has it
	   // we cannot access a default method in static context in an interface
   }
   default void print()// overriding print() to acces A type print()
   {
	   A.super.print();
   }
  /* default void print()
   {
	  // when b and a both have the same default method and c creates a default method of its own the parent ones get shadowed
   }*/
}
