package aggregation;

public class Driver {
 public static void main(String[] args) {
	Sim sim = new Sim(1233465599);
	Phone p = new Phone("apple",sim);
	p.display();
	p=null;
	System.out.println(sim.phoneNo);
}
}
