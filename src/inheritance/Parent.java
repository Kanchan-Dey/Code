package inheritance;

public class Parent {
static int a=20;
int b=10;
public static void print()
{
	System.out.println("this is a static method");
}
public void mesage() {
	System.out.println("this is a non static method");
}
static
{
	System.out.println("static intiailizer");
}
{
	System.out.println("non static initializer");
}
Parent(){
	System.out.println("parent constructor");
}
}
