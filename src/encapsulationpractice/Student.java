package encapsulationpractice;

public class Student {
	private String name;
	private int rollno;
	private double cgpa;

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
			System.out.println("Invalid cgpa");
		}
	}

	public String getName() {
		return this.name;
	}

	public int getRollNo() {
		return this.rollno;
	}

	public Double getCgpa() {
		return this.cgpa;
	}

}
