package treesets;


import java.util.TreeSet;

public class EmployeeDriver {
	public static void main(String[] args) {
	TreeSet<Employee> employees = new TreeSet<Employee>(new CompareByName());
		employees.add(new Employee("SUSAN", 200.0));
		employees.add(new Employee("TUSAN", 300.0));
		employees.add(new Employee("BUSAN", 200.0));
		System.out.println(employees);

	}
}
