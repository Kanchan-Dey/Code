package interfaces;

public interface A {
   int   a=10;
   static void message()
   {
	   System.out.println("A");
   }
   default void print()
   {
	   System.out.println("HEy");
   }
}
