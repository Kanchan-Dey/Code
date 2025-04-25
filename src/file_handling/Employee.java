package file_handling;

import java.io.Serializable;

public class Employee implements Serializable{
	private int id;
	private String name;
	private double salary;

	Employee(int id, String name, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public double getSalary() {
		return salary;
	}

	public String toString() {
		return getName() + " " + getId() + " " + getSalary();
	}
}
