package staticandnonstatic;

public class Demo1 {
 static int id =10;
 String name="rAj";
 public Demo1() {
	 System.out.println(id);
	 System.out.println(name);
 }
 public static void main(String[] args) {
	Demo1 d=new Demo1(); System.out.println(d.name);
	}
}
