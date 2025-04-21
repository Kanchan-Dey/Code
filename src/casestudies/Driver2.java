package casestudies;

public class Driver2 {
public static void main(String[] args) {
	PartTimeEmployee p= new PartTimeEmployee("k",200.0,100);
	PartTimeEmployee p1= new PartTimeEmployee("p",150.0,80);
	FullTimeEmployee p3 = new FullTimeEmployee("i",300.0,190);
	p.PartTimeEmployeeInfo();
	p1.PartTimeEmployeeInfo();
	p3.FullTimeEmployeeInfo();
	if(p.compareTo(p3)>0)
	{
		System.out.println("PERSON 3 IS POOR");
	}
	else
	{
		System.out.println("PERSON 1 IS POOR");
	}
}
}
