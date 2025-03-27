package universitymanagementsystem;

public class Driver {
public static void main(String[] args) {
	University uni = new University(5);

	Person p= new Student("kanchan",18,2000);
	uni.addPerson(p);
	Person p1= new Professor("amit",45,"AIML");
	uni.addPerson(p1);
	Person p2= new Professor("amit",45,"AIML");
	uni.addPerson(p2);
	uni.showPeople();
	
	
}
}
