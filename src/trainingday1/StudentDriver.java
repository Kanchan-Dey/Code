package trainingday1;

import java.util.Scanner;

public class StudentDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();

        System.out.print("Enter student name: ");
        s.setName(sc.nextLine());

        System.out.print("Enter roll number: ");
        s.setRollno(sc.nextInt());

        System.out.print("Enter CGPA: ");
        s.setCgpa(sc.nextDouble()); // Handles validation recursively

        System.out.println("\nStudent Details:");
        System.out.println("Name: " + s.getName());
        System.out.println("Roll No: " + s.getRollNo());
        System.out.println("CGPA: " + s.getCgpa());

        sc.close(); // Close Scanner only at the end
    }
}