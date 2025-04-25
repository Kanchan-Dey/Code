package oopspractice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class Department implements Iterator<Employee> {
	private String name;
	private List<Employee> employees;

	Department(String name) {
		this.name = name;
		employees = new ArrayList<Employee>();
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	void addEmployee(Employee e) throws DepartmentFullException {
		if (getEmployees().size() > 10) {
			throw new DepartmentFullException("TERi");

		} else {
			getEmployees().add(e);
		}
	}

	// Remove the Iterator implementation and these methods:
	// hasNext() and next()

	// Change getHighestPaidEmployee() to:
	public Optional<Employee> getHighestPaidEmployee() {
	    return employees.stream()
	            .max(Comparator.comparingDouble(Employee::getSalary));
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub

		Iterator<Employee> itr = getEmployees().iterator();
		while (itr.hasNext()) {
			return true;
		}
		return false;
	}

	@Override
	public Employee next() {
		// TODO Auto-generated method stub
		Iterator<Employee> itr = getEmployees().iterator();
		while (itr.hasNext()) {
			return itr.next();
		}
		return null;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	
}
