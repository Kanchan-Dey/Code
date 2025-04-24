package oopspractice;

public class Developer extends Employee {
     private String programminglanguage;
     Developer(String id,String name,double salary,String programminglanguage)throws InvalidEmployeeException
     {
    	 super(id,name,salary);
    	 this.programminglanguage=programminglanguage;
     }
     public String getProgrammingLanguage()
     {
    	 return programminglanguage;
     }
     void calculateBonus()
     {
    	  double bonus=(20/100)*getSalary();
    	  System.out.println(bonus);
     }

	
}
