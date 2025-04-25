package oopspractice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Employee implements Comparable<Employee> {
	private String id;
	private String name;
	private double salary;

	Employee(String id, String name, double salary) throws InvalidEmployeeException {
		Pattern pattern = Pattern.compile(id);
		Matcher matcher = pattern.matcher(this.id);
		if (matcher.find()) {
			this.id = id;
		} else {
			throw new InvalidEmployeeException("Invalid employee id");
		}
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public String getId() {
		return id;
	}

	abstract void calculateBonus();
   public int compareTo(Employee e)
   {
	   return this.getName().compareTo(e.getName());
   }
}
