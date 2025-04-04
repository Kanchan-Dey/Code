package wrapperclass;

public class Wrapper {
public static void main(String[] args) {
	double d=10.0;
     Double b = Double.valueOf(d);
     System.out.println(b);
     Integer i=10;
     Short s=2;
     Long l=(long)s+i;
     String str = Long.toString((s+l));
}
}
