package oopspractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

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

	public Employee getHighestPaidEmployee() {
		Collections.sort(getEmployees(), new CompareBySalary());
		return (Employee) getEmployees().getFirst();
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
}
