package encapsulationpractice;

import java.util.Scanner;

public class StudentDriver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student s = new Student();
		s.setName(sc.nextLine());
		sc.nextLine();
		s.setRollno(sc.nextInt());
		s.setCgpa(sc.nextDouble());
		System.out.println(s.getName() + "" + s.getRollNo() + "" + s.getCgpa());
		sc.close();
	}
}
