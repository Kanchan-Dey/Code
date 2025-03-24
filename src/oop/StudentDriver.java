package oop;

public class StudentDriver {
   public static void main(String[] args) {
	Student s1 = new Student(1,"chut","JATIOROTNO",20.0);
	/*s1.name="Chutpaglu";
	s1.marks=10.0;
	s1.bhv="good";
	s1.stdid=1;
	s1.cllgname="UEM";*/
	System.out.println(s1.cllgname + " " + s1.bhv + " " + s1.stdid + " " + s1.name +  " "+ s1.marks);
	s1.Studying();
	System.out.println();
	Student s2 = new Student(2,"podh","JATIOROTNO",20.0);
	/*s2.name="Podhpaglu";
	s2.marks=5.0;
	s2.bhv="bodmas";
	s2.stdid=2;
	s2.cllgname="IEM";*/
	System.out.println(s2.cllgname + " " + s2.bhv + " " + s2.stdid + " " + s2.name +  " "+ s2.marks);
	s2.Studying();
	Student s3=new Student();
	Student s4 = new Student(2,"harry");
	System.out.println(s4.name);
	
   }
}
