package comparablecasestudy;

public class Person implements Comparable{
  String name;
  int age;
  public Person(String name,int age)
  {
	  this.name=name;
	  this.age=age;
  }
  public String toString()
  {
	  return name+ " "+ age;
  }
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Person e= (Person)o;
	    int namecompare= this.name.compareTo(e.name);
	    if(namecompare!=0)
	    {
	    	return namecompare;
	    }
	    return Integer.compare(this.age, e.age);
	}

}
/* if(this.name.compareTo(p.name)!=0){return this.name.compareTo(p.name);}
if(this.age-p.age!=0){return this.age-p.age;}return 0;}*/