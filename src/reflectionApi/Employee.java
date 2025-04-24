package reflectionApi;

public class Employee {
	private String name;
	private int id;
	private double salary;
	private int age;

	Employee(String name, int id, int age, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.age = age;
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

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return name + " " + salary + " " + age + " " + id;
	}
}
