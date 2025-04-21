package casestudies;

public class UnivDriver {
public static void main(String[] args) {
University uni = new University(3);
Person1 p1= new Student1("kanchan",21,1);
uni.addPerson(p1);
Person1 p2 = new Professor1("TURJO",22,"AIML");
uni.addPerson(p2);

uni.showPeople();
}
}
