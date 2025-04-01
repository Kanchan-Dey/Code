package interfaces;

public interface B {
double a =30;
static void message()
{
	   System.out.println("B");
}

default void print() {
	System.out.println("HEllo");
}
}
