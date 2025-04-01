package stringtasks;

public class Student {
   private String name;
   private int id;
   private char gender;
   private double marks;
   public Student(String name,int id,char gender,double marks)
   {
	   this.name=name;
	   this.id=id;
	   this.gender=gender;
	   this.marks=marks;
   }
   public String toString()
   {
	   System.out.println(this.name+" "+this.id+" "+this.gender+" "+this.marks);
	   return "";
   }
   public boolean equals(Object o)
   {
	   if(o instanceof Student)
	   {
		   Student e= (Student)o;
		   return this.id==e.id && this.gender==e.gender && this.id==e.id;
	   }
	   return false;
   }
   public int hashcode()
   {
	   return (int)(this.id+this.marks);
   }
}
