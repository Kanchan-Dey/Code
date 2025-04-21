package trainingday1;

import java.util.Scanner;

public class Student {
    private String name;
    private int rollno;
    private double cgpa;
    private static Scanner sc = new Scanner(System.in); // Single shared Scanner

    public void setName(String name) {
        this.name = name;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public void setCgpa(Double cgpa) {
        if (cgpa >= 0.0 && cgpa <= 10.0) {
            this.cgpa = cgpa;
        } else {
            System.out.print("Invalid CGPA (Must be 0.0-10.0). Re-enter CGPA: ");
            setCgpa(sc.nextDouble()); // Recursive retry (avoids new Scanner)
        }
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollno;
    }

    public Double getCgpa() {
        return cgpa;
    }
}