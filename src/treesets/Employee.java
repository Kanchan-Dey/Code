package treesets;

public class Employee implements Comparable<Employee> {
	String name;
	double salary;

	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "name=" + name + ", salary=" + salary;
	}

	@Override
	public int compareTo(Employee e) {
		// TODO Auto-generated method stub
		return (int) (this.salary - e.salary);
	}

}
